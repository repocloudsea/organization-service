package com.cloudsea.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author shahbaz
 *
 */
@SpringBootApplication(scanBasePackages = { "com.cloudsea.*" })
@EnableSwagger2
@Import(value = { SpringDataRestConfiguration.class })
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
