package com.cg.spring.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableSwagger2
public class EmployeeApiTest {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeApiTest.class);

	public static void main(String[] args) {

		LOG.info("Start...");

		SpringApplication.run(EmployeeApiTest.class, args);

	}
}
