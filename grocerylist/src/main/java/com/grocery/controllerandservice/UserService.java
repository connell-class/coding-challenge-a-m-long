package com.grocery.controllerandservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grocery.pojo.GroceryList;
import com.grocery.pojo.User;
import com.grocery.repo.UserRepo;


@Service
public class UserService {
	
	
private UserRepo br;
    
    public List <User> getAll(){
        return br.getAll();
    }

    public void InsertUser(User b) {
    	System.out.println("I hope this works");
    	System.out.println(b);
        br.InsertUser(b);
        
    }
    public void InsertList(GroceryList a) {
    	br.InsertList(a);
    }

}
