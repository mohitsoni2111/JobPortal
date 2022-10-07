package edu.ncsu.group9.jobPortal.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class UserDto {

    @Id
    String userId;

    @NotNull(message = "Password is mandatory")
    String userPassword;

    int isStudent;

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

    public int getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(int isStudent) {
        this.isStudent = isStudent;
    }
}
