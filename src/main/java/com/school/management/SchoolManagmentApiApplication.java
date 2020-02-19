package com.school.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableAutoConfiguration
@EntityScan("com.school.management.model")
@EnableJpaRepositories("com.school.management.repository")
@ComponentScan({"com.school.management.controller","com.school.managemen.services"})
public class SchoolManagmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagmentApiApplication.class, args);
	}

	
	
}
