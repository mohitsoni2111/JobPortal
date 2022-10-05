package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.CompanyDao;
import edu.ncsu.group9.jobPortal.dao.StudentDao;
import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import edu.ncsu.group9.jobPortal.model.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class DashboardService {
    @Autowired
    CompanyDao companyDao;

    public void addCompanyDetails(CompanyInfo companyInfo) {
        log.info("Going to insert a company record for {}", companyInfo.getCompanyId());
        companyDao.insertCompanyDetails(companyInfo);
    }
}
