package com.school.management;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import oracle.jdbc.datasource.OracleDataSource;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableAutoConfiguration
@EntityScan("com.school.management.repository.model")
@EnableJpaRepositories("com.school.management.repository")
@ComponentScan({"com.school.management.repository.controller","com.school.management.repository.services"})
public class SchoolManagmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagmentApiApplication.class, args);
	}

	
	
}
