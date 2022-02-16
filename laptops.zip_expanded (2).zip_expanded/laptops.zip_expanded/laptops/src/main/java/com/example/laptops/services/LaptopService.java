package com.example.laptops.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laptops.dao.LaptopRepository;
import com.example.laptops.handlers.RecordNotFoundException;
import com.example.laptops.model.Laptop;

@Service
public class LaptopService {

	@Autowired
	LaptopRepository laptopRepository;
	
	public Laptop save(Laptop laptop) {
		//check whether the data is their on table.
		if (laptop.getId() == null) {
			laptop = laptopRepository.save(laptop);
			return laptop;
		} else {
			//adding the new set of data means to add  values.
			Optional<Laptop> laptopOptional = laptopRepository.findById(laptop.getId());

			  if (laptopOptional.isPresent()) {
				  
				Laptop newEntity = laptopOptional.get();
				newEntity.setLaptopName(laptop.getLaptopName());
				newEntity.setLaptopType(laptop.getLaptopType());
				newEntity = laptopRepository.save(newEntity);
			   
				return newEntity;
			} else {  
				throw new RecordNotFoundException("No laptop record exist for given id");
			}
		}
	}



// Find the the database and get 
	public List<Laptop> findAll() {
		List<Laptop> result = (List<Laptop>) laptopRepository.findAll();

		if (result.size() > 0) {
			return result;
		} else {
			return new ArrayList<Laptop>();//it return multiple values
		}
	}


	
//Writing function to deleteby id
	public void deleteById(Integer id) {
		Optional<Laptop> laptop = laptopRepository.findById(id);

		if (laptop.isPresent()) {
			laptopRepository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No laptop record exist for given id");
		}
	}

	void deleteAll() {
		laptopRepository.deleteAll();
	}


//to get the value with id
	public Laptop getLaptop(Integer id) throws RecordNotFoundException 
	{
		
		Optional<Laptop> laptop= laptopRepository.findById(id);
		System.out.println(laptop);
		
		if(!laptop.isPresent())
		{
			throw new RecordNotFoundException("No laptop with Id no."+id+" exist");
		}
		
	  return laptop.get();
	}
}

