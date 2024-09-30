package com.example.NoArgConst;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NonNull;

@Component
@ComponentScan
@ConfigurationProperties(prefix ="my.app")
@Data
public class NoArgCons implements CommandLineRunner{
	private int id;
	@NonNull
	private String name;
	private double amt;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}
	

}
