package edu.ncsu.group9.jobPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class JobPortalApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(JobPortalApplicationRunner.class, args);
    }

}
