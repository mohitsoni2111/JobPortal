package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.Student;

import java.util.List;

public interface studentDaoInterface {
    void insertStudent(Student student);
    void insertStudents(List<Student> students);
    List<Student> getAllStudents();
    Student getStudentById(String empId);
}
