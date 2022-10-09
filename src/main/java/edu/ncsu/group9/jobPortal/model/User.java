package edu.ncsu.group9.jobPortal.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@ApiModel(description = "Represents a user i.e. Either a Student or a Recruiter")
public class User {

    @Id
    @ApiModelProperty("Represents emailId of the user")
    String userId;

    @ApiModelProperty("Represents login password")
    @NotNull(message = "Password is mandatory")
    String userPassword;

    public User() {}

    public User(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }

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