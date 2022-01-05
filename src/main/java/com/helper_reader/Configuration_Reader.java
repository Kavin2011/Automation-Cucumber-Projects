package com.helper_reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {

		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\Automation_Project\\src\\main\\java\\com\\properties\\configuration.properties");
		
		FileInputStream fis= new FileInputStream(f);
		
		p= new Properties();
		
		p.load(fis);
	
	}
	
	public String getUrl() {
		
		String url=p.getProperty("url");
		
		return url;		
		
	}
	 
	public String getEmail() {
		
		String email=p.getProperty("email");
		
		return email;	
	}
	
	public String getPassword() {
		
		String password=p.getProperty("password");
		
		return password;	
	}
	
	public String getSize() {
		
		String size=p.getProperty("size");
		
		return size;		
		
	}
	
	public String getLandmark() {
		
		String landmark=p.getProperty("landmark");
		
		return landmark;		
		
	}


}
