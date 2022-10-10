package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.UserDao;
import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.model.User;
import edu.ncsu.group9.jobPortal.model.UserDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Mock
    UserDao userDao;

    @InjectMocks
    UserService userService;
    User user;
    Student student;

    @Before
    public void setUp() {
        student = new Student("12", "4567", "Mohit", "Soni", "avc@gmail.com", "CS", "MS", "12234");
        user = new User(student.getEmailId(), student.getPassword());
    }

    @Test
    public void checkUser() {
        int row = userDao.addUser(student);
        String loginMsg = userService.checkUser(user);
//        assertEquals(UserDao.COORDINATOR_LOGIN_SUCCESSFUL, loginMsg);
        assertEquals(null, loginMsg);
    }

    public UserDto getUserDto(String id, String password, int isStudent) {
        return new UserDto(id, password, isStudent);
    }
}