package com.grocery.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "item")
public class GroceryItem {
	
	@Id
	@Column(name = "item_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	@Column(name="item_type")
	String type;
	
	@Column(name = "item_cost")
	int cost;
	
	
	
	
	
	public GroceryItem(String type, int cost) {
		super();
		this.type = type;
		this.cost = cost;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public int getCost() {
		return cost;
	}





	public void setCost(int cost) {
		this.cost = cost;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (cost != other.cost)
			return false;
		if (id != other.id)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "GroceryItem [id=" + id + ", type=" + type + ", cost=" + cost + "]";
	}

}
