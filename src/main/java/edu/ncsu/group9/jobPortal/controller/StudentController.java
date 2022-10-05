package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

}
