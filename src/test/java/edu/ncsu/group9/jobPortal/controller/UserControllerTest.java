package edu.ncsu.group9.jobPortal.controller;

import edu.ncsu.group9.jobPortal.model.User;
import edu.ncsu.group9.jobPortal.service.UserService;
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
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureRestDocs(outputDir = "target/snippets")
public class UserControllerTest {

    private final String SUCCESSFUL = "SUCCESSFUL";
    private final String UNSUCCESSFUL = "UNSUCCESSFUL";
    private final String VALID_USER = "{\"userId\" : \"tilak\", \"userPassword\" : \"validpassword\"}";
    private final String INVALID_USER = "{\"userId\" : \"tilak\", \"userPassword\" : \"wrongpassword\"}";

    @Mock
    UserService userService;
    @InjectMocks
    UserController userController;
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void checkUserCredentialsTest_when_CredentialsValid() throws Exception {
        when(userService.checkUser(any(User.class))).thenReturn(SUCCESSFUL);
        mockMvc.perform(post("/user/login")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(VALID_USER))
                .andExpect(status().isOk())
                .andExpect(content().string(SUCCESSFUL))
                .andDo(print());
    }

    @Test
    public void checkUserCredentialsTest_when_InvalidCredentials() throws Exception {
        when(userService.checkUser(any(User.class))).thenReturn(UNSUCCESSFUL);
        mockMvc.perform(post("/user/login")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(INVALID_USER))
                .andExpect(status().isOk())
                .andExpect(content().string(UNSUCCESSFUL))
                .andDo(print());
    }

}