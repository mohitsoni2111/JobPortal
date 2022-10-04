package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static final String INSERT_STUDENT_SQL = "INSERT INTO JOBPORTAL.STUDENT VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

    public int insertStudentRecord(Student student) {
        int rows = 0;
        try {
            student.setStudentId(UUID.randomUUID().toString());
            rows = jdbcTemplate.update(INSERT_STUDENT_SQL,
                            student.getStudentId(),
                            student.getFirstName(),
                            student.getLastName(),
                            student.getPassword(),
                            student.getEmailId(),
                            student.getDegree(),
                            student.getCourse(),
                            student.getPhoneNumber()
            );
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(rows + " row(s) inserted into the Student Table");
        return rows;
    }


}
