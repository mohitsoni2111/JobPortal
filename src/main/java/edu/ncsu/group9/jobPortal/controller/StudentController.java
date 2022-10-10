package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.dao.UserDao;
import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    UserDao userDao;

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Registers and Adds the student to the portal",
            notes = "Requires Student Information")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        userDao.addUser(student);
    }

}
