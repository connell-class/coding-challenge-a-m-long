package com.grocery.pojo;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table (name = "list")


public class GroceryList {
	
	
	@Id
	@Column(name = "list_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	
	@Column(name = "list_item")
	private String item; 
	
	
	@Column(name = "grocery_day")
	private Date day;
	
	
	
	@JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name= "grocery_username")
    private User main;	
	
	
	
	 public User getMain() {
	        return main;
	    }
	    public void setHome(User main) {
	        this.main = main;
	    }
	
	public GroceryList() {
		
	}
	
	
	public GroceryList(String item, Date day) {
		super();
		this.item = item;
		this.day = day;
	}
	@Override
	public String toString() {
		return "GroceryList [id=" + id + ", item=" + item + ", day=" + day + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	

}
