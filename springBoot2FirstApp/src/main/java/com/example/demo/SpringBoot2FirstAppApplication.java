package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2FirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SpringBoot2FirstAppApplication.class, args);
		DataSourceInf ds = ac.getBean("dataSourceInf", DataSourceInf.class);
		ds.getmsg();
	}

}
