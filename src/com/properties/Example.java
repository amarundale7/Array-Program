package com.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class Example {
	public static void main(String [] args) {
		try {
			//Step-1 Read the data from file
			FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\sample.properties");
			// Step-2
			// Create object of properties class
			Properties properties = new Properties();
			properties.load(fis);
			//step - 3
			String name=properties.getProperty("username");
			String pass=properties.getProperty("password");
			// step-4
			System.out.println("Username is>>"+name);
			System.out.println("Password is >>"+pass);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
