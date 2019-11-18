package com.grocery.repo;

import java.util.List;
import javax.persistence.Parameter;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.grocery.pojo.GroceryList;
import com.grocery.pojo.User;

import org.hibernate.SessionFactory;
import org.hibernate.Criteria;


@Transactional
@Repository("UserRepo")

public class UserRepo {
	
	
	   public UserRepo(){
	        
	    }
	    
	    
	    static {
	        try {
	            Class.forName("org.postgresql.Driver");
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	    
	    
	    
	    private SessionFactory sesFact;
	    
	    @Autowired
	    public UserRepo(SessionFactory sesFact) {
	        super();
	        this.sesFact = sesFact;
	    }
	    
	    
	    public List<User> getAll(){
	        
	        Session ses = sesFact.getCurrentSession();  
	        String hql = "from User";
	        return ses.createQuery(hql, User.class).list();
	    }
	    
	    
	    public void InsertUser(User b){
	        sesFact.getCurrentSession().save(b);
	    }
	    
	    
	    public void InsertList(GroceryList a) {
	    	sesFact.getCurrentSession().save(a);
	    }
	    
	    
	    
	    
	
	
	
	
	
	

}
