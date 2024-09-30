package com.example.college;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Component
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix ="my.app")
public class Dbcon implements CommandLineRunner{

	private Integer sid;
	private String sname;
	Student stu;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("From DBConnect");
		System.out.println(this);
		
	}

}
