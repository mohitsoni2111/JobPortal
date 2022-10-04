package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.StudentDao;
import edu.ncsu.group9.jobPortal.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.insertStudentRecord(student);
    }

}
