package com.example.restaurant.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restra {
	@Id
	
 int id;
 String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}



