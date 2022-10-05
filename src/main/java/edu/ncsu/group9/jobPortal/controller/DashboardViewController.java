package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardViewController {

    @Autowired
    StudentService studentService;

    public void getStudentDashboardInfo() {

    }

}
