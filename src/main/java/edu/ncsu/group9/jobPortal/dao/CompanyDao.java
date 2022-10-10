package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.CompanyInfo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import edu.ncsu.group9.jobPortal.util.Util;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Log4j2
@Service
public class CompanyDao {

    /*
        CompanyDao class that contains functions related to companies.
     */

    public static final String INSERT_COMPANY_SQL = "INSERT INTO JOBPORTAL.DASHBOARD(companyName, jobType, profileDescription, streamType, jobUrl, validity) VALUES (?, ?, ?, ?, ?, ?);";
    public static final String GET_VALID_COMPANY_SQL = "SELECT * FROM JOBPORTAL.DASHBOARD WHERE VALIDITY >= ?";
    @Autowired
    JdbcTemplate jdbcTemplate;

    /*
    Constructor to use jdbcTemplate.
     */
    public CompanyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
    This function insert a company detail.
     */
    public int insertCompanyDetails(CompanyInfo companyInfo) {
        int rows = 0;
        try {
            rows = jdbcTemplate.update(INSERT_COMPANY_SQL, new Object[]{companyInfo.getCompanyName(), companyInfo.getJobType(), companyInfo.getProfileDescription(), companyInfo.getStreamType(), companyInfo.getJobUrl(), companyInfo.getValidity()});
        } catch (Exception exception) {
            log.error("Error Occurred while inserting record in the user table. Exception -> ");
            exception.printStackTrace();
        }
        log.info("{} rows inserted in the Company Record", rows);
        return rows;
    }

    /*
    This function returns list of all valid companies.
     */
    public List<CompanyInfo> getValidCompanies() {
        List<CompanyInfo> companyList = new ArrayList<>();
        try {
            String date = Util.getYYYYMMDDDate();
            companyList = (List<CompanyInfo>) jdbcTemplate.query(GET_VALID_COMPANY_SQL, new Object[]{date}, new ResultSetExtractor<Object>() {
                @Override
                public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                    List<CompanyInfo> companyInfoList = new ArrayList<>();
                    while (rs.next()) {
                        CompanyInfo company = new CompanyInfo();
                        company.setCompanyId(Integer.parseInt(rs.getString("companyId")));
                        company.setCompanyName(rs.getString("companyName"));
                        company.setJobType(rs.getString("jobType"));
                        company.setJobUrl(rs.getString("jobUrl"));
                        company.setProfileDescription(rs.getString("profileDescription"));
                        company.setStreamType(rs.getString("streamType"));
                        company.setValidity(rs.getDate("validity").toString());
                        companyInfoList.add(company);
                    }
                    return companyInfoList;
                }
            });
            log.info("Found {} valid companies for application", companyList.size());
            return companyList;
        } catch (EmptyResultDataAccessException exception) {
            log.warn("No Companies Found");
        } catch (Exception exception) {
            log.error("Exception occurred while fetching all valid companies. Exception ->");
            exception.printStackTrace();
        }
        return companyList;
    }
}
