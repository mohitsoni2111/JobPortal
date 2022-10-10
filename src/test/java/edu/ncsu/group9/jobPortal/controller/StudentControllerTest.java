package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.dao.UserDao;
import edu.ncsu.group9.jobPortal.model.Student;
import edu.ncsu.group9.jobPortal.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureRestDocs(outputDir = "target/snippets")
public class StudentControllerTest {

    private static final String STUDENT = "{\"studentId\": \"1\",\"password\": \"sjgjf\",\"firstName\": \"tilak\",\"lastName\": \"satra\",\"emailId\":\"sjgde@gmail.com\",\"degree\":\"Masters\",\"course\":\"CS\",\"phoneNumber\":\"367468743\"}";

    MockMvc mockMvc;
    @Mock
    StudentService studentService;
    @Mock
    UserDao userDao;
    @InjectMocks
    StudentController testObj;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(testObj).build();
    }

    @Test
    public void addStudent() throws Exception {
        doNothing().when(studentService).addStudent(any(Student.class));
        when(userDao.addUser(any(Student.class))).thenReturn(1);
        mockMvc.perform(
            post("/user/add")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .content(STUDENT)
        )
        .andExpect(status().isOk())
        .andDo(print());
    }

}