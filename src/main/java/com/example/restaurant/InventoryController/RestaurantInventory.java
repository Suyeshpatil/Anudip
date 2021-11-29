package com.example.restaurant.InventoryController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestaurantInventory {
	

		@RequestMapping(value = "/index" , method = RequestMethod.GET)
		
	    public String index()
	           {
	       return "/index";
	           }
}
		 
