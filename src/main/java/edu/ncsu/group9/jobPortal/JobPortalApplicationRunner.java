package edu.ncsu.group9.jobPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JobPortalApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplicationRunner.class, args);
	}

}
