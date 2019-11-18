package com.grocery.sketch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grocery.pojo.User;
import com.grocery.repo.UserRepo;

public class Driver {
	
	
	 private static ApplicationContext ac = 
	            new ClassPathXmlApplicationContext("applicationcontext.xml");
	    
	    
	    
	    private static UserRepo br = ac.getBean(UserRepo.class);
	    
	    

	public static void main(String[] args) {
		
		User gosh =new User( "fred", "fred", "man", null, null, null);
		
		
		
		br.InsertUser(gosh);
		
		
		
		
		
	}
	
//	this.username = username;
//	this.firstName = firstName;
//	LastName = lastName;
//	this.email = email;
//	this.password = password;
//	this.birthday = birthday;
}
