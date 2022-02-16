package com.example.laptops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//using annotation for configuration/component scan for class path
@SpringBootApplication
public class LaptopsApplication {

	public static void main(String[] args) {
		//adding Exception  Handling
		try {
			//lauching Spring application.
		SpringApplication.run(LaptopsApplication.class, args);
		}
		//throws the exception if theirs any
		catch(Exception e){  
			System.out.println("port 9000 error");
		}
		//prints statement if any requirement and updates required.
		finally {
			System.out.println(" if any update requried contact the Adminstrator");
		}
		}

}
