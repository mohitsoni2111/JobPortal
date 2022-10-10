package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import edu.ncsu.group9.jobPortal.service.DashboardService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureRestDocs(outputDir = "target/snippets")
public class DashboardViewControllerTest {

    private static final String COMPANY = "{\"firstname\": \"Tilak\",\"lastname\": \"Satra\",\"password\": \"bchjdfrfr\",\"emailid\": \"ayushsatra@ncsu.edu\",\"degree\": \"Masters\",\"course\": \"Computer Science\",\"phone\": \"9283833221\"}";

    MockMvc mockMvc;

    @Mock
    DashboardService dashboardService;

    @InjectMocks
    DashboardViewController dashboardViewController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(dashboardViewController).build();
    }

    @Test
    public void getStudentDashboardInfoTest() throws Exception {
        when(dashboardService.getAllNonExpiredCompanyList()).thenReturn(getCompanyList());
        mockMvc.perform(get("/dashboard/get/all"))
                .andExpect(status().isOk())
                .andDo(print());
    }

//    @Test
//    public void addCompanyTest() throws Exception {
//        doNothing().when(dashboardService).addCompanyDetails(any(CompanyInfo.class));
//        mockMvc.perform(post("/dashboard/add")
//                        .accept(MediaType.APPLICATION_JSON)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(COM)
//                ).andExpect(status().isOk())
//                .andDo(print());
//    }

    public List<CompanyInfo> getCompanyList() {
        List<CompanyInfo> companyInfoList = new ArrayList<>();
        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setCompanyId(3334);
        companyInfo.setStreamType("CS");
        companyInfo.setProfileDescription("Full Time");
        companyInfo.setJobUrl("Job URL");
        companyInfo.setCompanyName("Apple");
        companyInfo.setValidity("2022-03-10");
        companyInfoList.add(companyInfo);
        return companyInfoList;
    }


}