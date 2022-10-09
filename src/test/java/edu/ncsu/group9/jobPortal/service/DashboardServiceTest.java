package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.CompanyDao;
import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
public class DashboardServiceTest {

    @Mock
    CompanyDao companyDao;

    @InjectMocks
    DashboardService dashboardService;
    CompanyInfo companyInfo;
    List<CompanyInfo> companyInfoList;

    @Before
    public void setUp(){
        companyInfoList = new ArrayList<>();
        CompanyInfo companyInfo = new CompanyInfo(3334, "Apple", "intern", "CS", "Full Time", "Job URL", "2022-03-10");
        companyInfoList.add(companyInfo);
    }

//    @Test
//    public void addCompanyDetails() {
//        dashboardService.addCompanyDetails(companyInfo);
//        List<CompanyInfo> companyInfoList1 = dashboardService.getAllNonExpiredCompanyList();
//        assertEquals(1, companyInfoList1.size());
//    }

    @Test
    public void getAllNonExpiredCompanyListTest() {
        companyDao.insertCompanyDetails(companyInfo);
        List<CompanyInfo> companyInfoList2 = companyDao.getValidCompanies();
        List<CompanyInfo> companyInfoList1 = dashboardService.getAllNonExpiredCompanyList();
        assertEquals(companyInfoList1.size(), companyInfoList2.size());
    }
}