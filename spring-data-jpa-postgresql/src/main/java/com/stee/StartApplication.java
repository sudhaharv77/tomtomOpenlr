package com.stee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.stee")
public class StartApplication  {

	private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
	
}