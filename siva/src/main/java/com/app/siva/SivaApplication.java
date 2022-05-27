package com.app.siva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SivaApplication {

	public static void main(String[] args) {

		ApplicationContext store = SpringApplication.run(SivaApplication.class, args);
	}

}
