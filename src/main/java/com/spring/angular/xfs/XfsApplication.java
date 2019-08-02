package com.spring.angular.xfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
@SpringBootApplication
@ComponentScan(basePackageClasses = XfsController.class)
public class XfsApplication {

	public static void main(String[] args) {
		SpringApplication.run(XfsApplication.class, args);
	
	}

}
