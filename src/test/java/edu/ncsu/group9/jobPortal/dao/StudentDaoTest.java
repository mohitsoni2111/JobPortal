package edu.ncsu.group9.jobPortal.dao;

import edu.ncsu.group9.jobPortal.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class StudentDaoTest {

    @Mock
    JdbcTemplate jdbcTemplate;

    @InjectMocks
    StudentDao testObj;

    @Test
    public void insertStudentRecordTest() {
        when(jdbcTemplate.update(anyString(), Optional.ofNullable(any()))).thenReturn(1);
        int rows = testObj.insertStudentRecord(getStudent());
        assertEquals(1, rows);
    }

    public Student getStudent() {
        Student student = new Student();
        student.setStudentId("7363");
        student.setCourse("course");
        student.setFirstName("Tilak");
        student.setLastName("Satra");
        student.setPhoneNumber("364737783");
        return student;
    }

}