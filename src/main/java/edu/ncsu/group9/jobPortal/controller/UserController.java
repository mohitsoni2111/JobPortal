package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.model.User;
import edu.ncsu.group9.jobPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String userUserLogin(@RequestBody User user) {
        return userService.checkUser(user);
    }
}
