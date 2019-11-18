package com.grocery.controllerandservice;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;

import com.grocery.pojo.GroceryList;
import com.grocery.pojo.User;

@Controller
@RequestMapping(value="/users")
public class MainController {
	///remeber the services
    private UserService user;

	 @GetMapping(value="getAll.app")
	    public ResponseEntity<List<User>> getAll(){
	        return new ResponseEntity<List<User>>(user.getAll(), HttpStatus.OK);
	    }
	 
	 @PostMapping(value= "/register")
	 public @ResponseBody User InsertUser(@RequestBody User u) {
	        System.out.println(u);
	        user.InsertUser(u);
	        return u;
	    }
	 
	 @PostMapping(value= "/createlist")
	 public @ResponseBody GroceryList InsertList(@RequestBody GroceryList u) {
	        System.out.println(u);
	        user.InsertList(u);
	        return u;
	    }
	 
	

}
