package com.example.college;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class Student {

	//private Integer sid;
	//private String sname;
	
	private List<String> lang;
	private Map<String, Integer> results;
	private Properties pdata;
    
	private String driver;
    private String url;
    private String uname;
    private String password;
    
}
