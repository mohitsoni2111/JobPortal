package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Log4j2
@Service
public class CompanyDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static final String INSERT_COMPANY_SQL = "INSERT INTO JOBPORTAL.DASHBOARD VALUES (?, ?, ?, ?, ?, ?);";

    public int insertCompanyDetails(CompanyInfo companyInfo) {
        int rows = 0;
        try {
            rows = jdbcTemplate.update(INSERT_COMPANY_SQL,
                    companyInfo.getCompanyName(),
                    companyInfo.getJobType(),
                    companyInfo.getProfileDescription(),
                    companyInfo.getStreamType(),
                    companyInfo.getJobUrl(),
                    companyInfo.getValidity()
            );
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        log.info("{} rows inserted in the Company Record", rows);
        return rows;
    }
}
