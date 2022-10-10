package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
public class StudentDao {

    /*
        StudentDao class that contains functions related to students.
     */

    @Autowired
    JdbcTemplate jdbcTemplate;

//    PasswordEncoder passwordEncoder;

    public static final String INSERT_STUDENT_SQL = "INSERT INTO JOBPORTAL.STUDENT VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

    /*
    This function insert a student detail.
     */
    public int insertStudentRecord(Student student) {
        int rows = 0;
        try {
            student.setStudentId(UUID.randomUUID().toString());
//            this.passwordEncoder = new BCryptPasswordEncoder();
//            student.setPassword(this.passwordEncoder.encode(student.getPassword()));
//            student.setPassword(bcrypt.hashpw(student.getPassword().encode('utf8'), BCrypt.gensalt()));
//            Password p = new Password(new BCryptPasswordEncoder().encode(student.getPassword()));
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
        log.info("{} rows inserted in the Student Record", rows);
        return rows;
    }
}
