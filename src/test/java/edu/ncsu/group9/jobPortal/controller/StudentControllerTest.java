package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class StudentControllerTest {

    MockMvc mockMvc;

    @Mock
    StudentService studentService;

    @InjectMocks
    StudentController testObj;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(testObj).build();
    }

    @Test
    public void addStudent() {

    }

}