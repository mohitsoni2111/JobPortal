package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.model.User;
import edu.ncsu.group9.jobPortal.model.UserDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Log4j2
@Service
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static final String CHECK_USER_SQL = "SELECT userId, userPassword, isStudent FROM JOBPORTAL.USER WHERE USERID=?";

    public static final String INSERT_USER_SQL = "INSERT INTO JOBPORTAL.USER VALUES (?, ?, ?)";

    public static final String COORDINATOR_LOGIN_SUCCESSFUL = "COORDINATOR LOGIN SUCCESSFUL";
    public static final String STUDENT_LOGIN_SUCCESSFUL = "STUDENT LOGIN SUCCESSFUL";
    public static final String UNSUCCESSFUL = "LOGIN UNSUCCESSFUL";


    public String checkUserRecord(User user) {
        String userId = user.getUserId();
        UserDto fetchedUser = null;
        try {
            fetchedUser = jdbcTemplate.queryForObject(CHECK_USER_SQL, new Object[] { userId }, new BeanPropertyRowMapper<>(UserDto.class));
            if (fetchedUser!=null && fetchedUser.getIsStudent() == 1)
                return checkStudentCredentials(user, fetchedUser);
            return Objects.isNull(fetchedUser) ? UNSUCCESSFUL : (user.getUserPassword().equals(fetchedUser.getUserPassword())? COORDINATOR_LOGIN_SUCCESSFUL : UNSUCCESSFUL);
        } catch (EmptyResultDataAccessException exception) {
            log.warn("No user found with userId -> {}", user.getUserId());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return UNSUCCESSFUL;
    }

    public String checkStudentCredentials(User user, UserDto fetchedUser) {
        return user.getUserPassword().equals(fetchedUser.getUserPassword()) ? STUDENT_LOGIN_SUCCESSFUL: UNSUCCESSFUL;
    }

    public int addUser(Student student) {
        int rows = 0;
        try {
            rows = jdbcTemplate.update(INSERT_USER_SQL, student.getEmailId(), student.getPassword(), 1);
            log.info("Inserted {} rows(s) into the User Table for {}", rows, student.getEmailId());
        } catch (Exception exception) {
            log.error("Error Occurred while inserting record in the user table. Exception -> ");
            exception.printStackTrace();
        }
        return rows;
    }

}
