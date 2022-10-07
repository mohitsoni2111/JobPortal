package edu.ncsu.group9.jobPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class JobPortalApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(JobPortalApplicationRunner.class, args);
    }

}
