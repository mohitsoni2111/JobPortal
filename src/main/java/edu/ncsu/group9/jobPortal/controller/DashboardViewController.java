package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import edu.ncsu.group9.jobPortal.service.DashboardService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/dashboard")
public class DashboardViewController {

    @Autowired
    DashboardService dashboardService;

    @GetMapping("/get/all")
    @ApiOperation(value = "Finds and returns all companies available for application",
            notes = "Returns a List of Company Information",
            response = CompanyInfo.class)
    public List<CompanyInfo> getStudentDashboardInfo() {
        return dashboardService.getAllNonExpiredCompanyList();
    }

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Adds the company information provided by the recruiter/coordinator into the dashboard",
            notes = "Required Company Information as the input to be added")
    public void addCompany(@RequestBody CompanyInfo companyInfo) {
        dashboardService.addCompanyDetails(companyInfo);
    }

}
