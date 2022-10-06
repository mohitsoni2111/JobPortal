package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.dao.StudentDao;
import edu.ncsu.group9.jobPortal.dao.UserDao;
import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.model.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public String checkUser(User user) {
        log.info("Checking the user record for {}", user.getUserId());
        return userDao.checkUserRecord(user);
    }
}
