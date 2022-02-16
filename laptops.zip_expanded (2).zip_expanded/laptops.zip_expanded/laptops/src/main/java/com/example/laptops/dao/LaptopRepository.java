package com.example.laptops.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.laptops.model.Laptop;

//A repository is a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects.
@Repository
//CrudRepository provides methods for generic CRUD operation 
public interface LaptopRepository extends CrudRepository<Laptop, Integer>{

	//Optional<Laptop> getById(Integer id);
	
	

}
