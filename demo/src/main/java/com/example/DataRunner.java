package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix ="my.app")
public class DataRunner implements CommandLineRunner {

	private Dbconn con;
	
	
	public Dbconn getCon() {
		return con;
	}


	public void setCon(Dbconn con) {
		this.con = con;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(con);
	}

}
