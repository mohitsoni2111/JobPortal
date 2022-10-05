package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.service.DashboardService;
import edu.ncsu.group9.jobPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/dashboard")
public class DashboardViewController {

    @Autowired
    StudentService studentService;

    @Autowired
    DashboardService dashboardService;

    public void getStudentDashboardInfo() {

    }

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCompany(@RequestBody CompanyInfo companyInfo) {
        dashboardService.addCompanyDetails(companyInfo);
    }

}
