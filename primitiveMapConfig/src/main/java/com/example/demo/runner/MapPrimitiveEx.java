package com.example.demo.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my.app")
public class MapPrimitiveEx implements CommandLineRunner{
 
	private Map<String,Integer> edata;
	
	public Map<String, Integer> getEdata() {
		return edata;
	}
	public void setEdata(Map<String, Integer> edata) {
		this.edata = edata;
	}
	
	@Override
	public String toString() {
		return "MapPrimitiveEx [edata=" + edata + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from Map Primitives");
		System.out.println(this);
		
	}

}
