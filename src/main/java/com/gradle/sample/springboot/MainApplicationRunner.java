package com.gradle.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * Distribution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Jun 17, 2016 8:55:13 AM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MainApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainApplicationRunner.class, args);
	}
}
