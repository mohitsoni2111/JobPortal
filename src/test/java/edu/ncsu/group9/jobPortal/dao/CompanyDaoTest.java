package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CompanyDaoTest {

    CompanyDao testObj;

    @Mock
    JdbcTemplate jdbcTemplate;

    @Before
    public void setUp() throws Exception {
        testObj = new CompanyDao(jdbcTemplate);
    }

    @Test
    public void getValidCompaniesTest() {
        when(jdbcTemplate.query(anyString(), any(Object[].class), any(ResultSetExtractor.class))).thenReturn(Collections.singletonList(getCompany()));
        List<CompanyInfo> companyInfoList = testObj.getValidCompanies();
        assertEquals(1, companyInfoList.size());
    }

    @Test
    public void getValidCompanies_when_ValidityExpired() {
        when(jdbcTemplate.query(anyString(), any(Object[].class), any(ResultSetExtractor.class))).thenReturn(Collections.emptyList());
        List<CompanyInfo> companyInfoList = testObj.getValidCompanies();
        assertEquals(0, companyInfoList.size());
    }

    @Test
    public void getValidCompanies_when_NoCompanyFound() {
        when(jdbcTemplate.query(anyString(), any(Object[].class), any(ResultSetExtractor.class))).thenThrow(EmptyResultDataAccessException.class);
        List<CompanyInfo> companyInfoList = testObj.getValidCompanies();
        assertEquals(0, companyInfoList.size());
    }

    @Test
    public void insertCompanyDetailsTest() {
        when(jdbcTemplate.update(anyString(), Optional.ofNullable(any()))).thenReturn(1);
        int rows = testObj.insertCompanyDetails(getCompany());
        assertEquals(1, rows);
    }

    public CompanyInfo getCompany() {
        CompanyInfo company = new CompanyInfo();
        company.setCompanyName("Company Name");
        company.setCompanyId(6357);
        company.setValidity("2022-10-23");
        company.setJobUrl("Job Url");
        company.setProfileDescription("Profile Description");
        company.setStreamType("CS");
        return company;
    }

}