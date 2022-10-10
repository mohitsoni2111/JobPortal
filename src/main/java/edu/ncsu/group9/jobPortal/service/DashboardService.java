package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.CompanyDao;
import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class DashboardService {

    /*
    This dashboard service class implements two functions: add company details and get list of all companies.
     */
    @Autowired
    CompanyDao companyDao;

    /*
    Function to add new company details.
     */
    public void addCompanyDetails(CompanyInfo companyInfo) {
        log.info("Going to insert a company record for {}", companyInfo.getCompanyId());
        companyDao.insertCompanyDetails(companyInfo);
    }

    /*
    Function to return list of all valid companies details.
     */
    public List<CompanyInfo> getAllNonExpiredCompanyList() {
        return companyDao.getValidCompanies();
    }

}
