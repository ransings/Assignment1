package com.sr;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class CRUDAssignment{

	
	public static void main(String[] args) {
		//Getting IOC container
		ApplicationContext ctx=SpringApplication.run(CRUDAssignment.class, args);
		
	}

}
