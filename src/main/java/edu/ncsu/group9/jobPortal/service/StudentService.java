package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.StudentDao;
import edu.ncsu.group9.jobPortal.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public void addStudent(Student student) {
        log.info("Going to insert a student record for {} {}", student.getFirstName(), student.getLastName());
        studentDao.insertStudentRecord(student);
    }

}
