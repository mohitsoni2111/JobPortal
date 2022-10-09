package edu.ncsu.group9.jobPortal.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel(description = "Represent the Student Information required during registration")
public class Student {

    @Id
    @ApiModelProperty("Represents the unique student id")
    String studentId;

    @ApiModelProperty("Represents the user's credentials")
    @NotNull(message = "Password is mandatory")
    String password;

    @ApiModelProperty("Represents user's first name")
    @NotNull(message = "firstName is mandatory")
    @Size(min=1, max=16)
    String firstName;

    @ApiModelProperty("Represents user's last name")
    @NotNull(message = "lastName is mandatory")
    @Size(min=1, max=16)
    String lastName;

    @ApiModelProperty("Represents user's emailId")
    @Email(message = "Email should be valid")
    String emailId;

    @ApiModelProperty("Represents user's degree in which he/she is enrolled in")
    @NotNull(message = "degree is mandatory")
    String degree;

    @ApiModelProperty("Represents the course currently undertaken")
    @NotNull(message = "course is mandatory")
    String course;

    @ApiModelProperty("Represents user's contact information")
    @NotNull(message = "phoneNumber is mandatory")
    String phoneNumber;

    public Student() {}

    public Student(String studentId, String password, String firstName, String lastName, String emailId, String degree, String course, String phoneNumber) {
        this.studentId = studentId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.degree = degree;
        this.course = course;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
