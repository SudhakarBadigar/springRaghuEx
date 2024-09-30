package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//this(@propertySource()) is a spring framework code in spring boot it automatically take 
// application.properties as default for loading the properties file

@PropertySource({
				"classpath:abcd.properties",
				"classpath:mno.properties",
				"file:./File1.properties",
				"file:E:/springBootPractice/propertyFiles/example.properties"
	             })
public class PropertySourceExApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertySourceExApplication.class, args);
	}

}
