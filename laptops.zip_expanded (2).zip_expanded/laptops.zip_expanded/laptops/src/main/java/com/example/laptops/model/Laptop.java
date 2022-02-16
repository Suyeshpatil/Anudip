package com.example.laptops.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//use of hibernate
@Entity              
public class Laptop {
  @Id             //                                    
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Integer id; 
  private String laptopName;
  private String laptopType;
//creating a constructor
  public Laptop(String laptopName, String laptopType) {
    this.laptopName = laptopName;
    this.laptopType = laptopType;
  }
//using getter and setter for assigning and returning values. 
  public Laptop() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLaptopName() {
    return laptopName;
  }

  public void setLaptopName(String laptopName) {
    this.laptopName = laptopName;
  }

  public String getLaptopType() {
    return laptopType;
  }

  public void setLaptopType(String laptopType) {
    this.laptopType = laptopType;
  }

}

