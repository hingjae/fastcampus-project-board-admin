package com.example.boardprojectadmin;

import com.example.boardprojectadmin.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BoardProjectAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardProjectAdminApplication.class, args);
	}

}
