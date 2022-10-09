package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.model.User;
import edu.ncsu.group9.jobPortal.model.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Mock
    JdbcTemplate jdbcTemplate;

    @InjectMocks
    UserDao userDao;

    @Test
    public void checkUserRecord_Valid_Student_Login() {
        when(jdbcTemplate.queryForObject(anyString(), (Object[]) any(Object.class), any(BeanPropertyRowMapper.class))).thenReturn(getUserDto("user@gmail.com", "password", 1));
        String loginMsg = userDao.checkUserRecord(getStudentUser());
        assertEquals(UserDao.STUDENT_LOGIN_SUCCESSFUL, loginMsg);
    }

    @Test
    public void checkUserRecord_when_No_Record() {
        when(jdbcTemplate.queryForObject(anyString(), (Object[]) any(Object.class), any(BeanPropertyRowMapper.class))).thenThrow(EmptyResultDataAccessException.class);
        String loginMsg = userDao.checkUserRecord(getStudentUser());
        assertEquals(UserDao.UNSUCCESSFUL, loginMsg);
    }

    @Test
    public void checkUserRecord_when_Recruiter() {
        when(jdbcTemplate.queryForObject(anyString(), (Object[]) any(Object.class), any(BeanPropertyRowMapper.class))).thenReturn(getUserDto("recruiter@gmail.com", "password", 0));
        String loginMsg = userDao.checkUserRecord(getStudentUser());
        assertEquals(UserDao.COORDINATOR_LOGIN_SUCCESSFUL, loginMsg);
    }

    @Test
    public void addUser() {
        when(jdbcTemplate.update(anyString(), (Object) any())).thenReturn(1);
        int rows = userDao.addUser(getStudent());
        assertEquals(1, rows);
    }

    @Test
    public void addUser_Exception_Occurred() {
        when(jdbcTemplate.update(anyString(), (Object) any())).thenThrow(EmptyResultDataAccessException.class);
        int rows = userDao.addUser(getStudent());
        assertEquals(0, rows);
    }

    public Student getStudent() {
        Student student = new Student();
        student.setStudentId("7363");
        student.setCourse("course");
        student.setFirstName("Tilak");
        student.setLastName("Satra");
        student.setPhoneNumber("364737783");
        return student;
    }

    public User getStudentUser() {
        User user = new User();
        user.setUserId("user@gmail.com");
        user.setUserPassword("password");
        return user;
    }

    public UserDto getUserDto(String id, String password, int isStudent) {
        return new UserDto(id, password, isStudent);
    }


}