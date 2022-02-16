package com.example.laptops.controllers;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptops.handlers.RecordNotFoundException;
import com.example.laptops.model.Laptop;
import com.example.laptops.services.LaptopService;

        //for creation of restful web services.
@RestController
public class LaptopController {
	    //Enabling object dependency injection
	  @Autowired
	  LaptopService laptopService;
	    //use Request Mapping
        //	 match URI expression.-uniform resource identifiers
	    //handling http POST requests
	  @PostMapping("/laptop")
	  Laptop create(@RequestBody Laptop laptop)  {
	    return laptopService.save(laptop);
	  }
	  //use to get http GET requests
	  @GetMapping("/laptop") 
	  Iterable<Laptop> read() {
	    return laptopService.findAll();
	  }	  
	  @GetMapping("/laptop/{id}")
		public Laptop getLaptop(@PathVariable Integer id ) throws RecordNotFoundException
		{
			return laptopService.getLaptop(id);
		}	  
	  
	  @PutMapping("/laptop")
       //the @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization of the inbound HttpRequest body onto a Java object.
	  Laptop update(@RequestBody Laptop laptop) {
	    return laptopService.save(laptop);
	  }

	
	  @DeleteMapping("/laptop/{id}")
      // @PathVariable annotation can be used to handle template variables .
	  void delete(@PathVariable Integer id) {
		  laptopService.deleteById(id);
	  }

	  @GetMapping("/wrong")
	  Laptop somethingIsWrong() {
	    throw new ValidationException("Something is wrong");
	  }
      // marks a method or exception class with the status code and reason message that should be returned
	  @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(ValidationException.class)
	  String exceptionHandler(ValidationException e) {
	    return e.getMessage();
	  }
	
}
//The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.

//Code	Status	Description
//200	OK	         The request was successfully completed.
//201	Created     	A new resource was successfully created.
//400	Bad Request 	  The request was invalid.
//401	Unauthorized    	The request did not include an authentication token or the authentication token was expired.
//403	Forbidden     			The client did not have permission to access the requested resource.
//404	Not Found					The requested resource was not found.
//405	Method Not Allowed				The HTTP method in the request was not supported by the resource. For example, the DELETE method cannot be used with the Agent API.
//500	Internal Server Error					The request was not completed due to an internal error on the server side.
//503	Service Unavailable								The server was unavailable.