package edu.ncsu.group9.jobPortal.model;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    @Id
    String studentId;
    @NotNull(message = "Password is mandatory")
    String password;
    @NotNull(message = "firstName is mandatory")
    @Size(min=1, max=16)
    String firstName;
    @NotNull(message = "lastName is mandatory")
    @Size(min=1, max=16)
    String lastName;
    @Email(message = "Email should be valid")
    String emailId;
    @NotNull(message = "degree is mandatory")
    String degree;
    @NotNull(message = "course is mandatory")
    String course;
    @NotNull(message = "phoneNumber is mandatory")
    String phoneNumber;

    public Student() {}

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
