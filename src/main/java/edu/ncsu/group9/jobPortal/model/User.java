package edu.ncsu.group9.jobPortal.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class User {

    @Id
    String userId;
    @NotNull(message = "Password is mandatory")
    String userPassword;

    public User() {}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}