package edu.ncsu.group9.jobPortal.service;

import edu.ncsu.group9.jobPortal.model.Student;

import java.util.List;

public interface studentServiceInterface {
    void insertStudent(Student student);
    void insertStudents(List<Student> students);
    void getAllStudents();
    void getStudentById(String studentId);
}
