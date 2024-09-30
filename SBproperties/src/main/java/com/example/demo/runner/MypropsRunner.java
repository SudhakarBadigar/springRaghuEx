package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MypropsRunner implements CommandLineRunner{
	@Value("${title}")
	private String title;
	@Value("${version}")
	private double ver;
	@Value("${app-id}")
	private int id;
	@Value("${language}")
	private String language;
	@Value("${os}")
	private String os;
	@Value("${framework}")
	private String framework;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "MypropsRunner [title=" + title + ", ver=" + ver + ", id=" + id + ", language=" + language + ", os=" + os
				+ ", framework=" + framework + "]";
	}
	
	

}
