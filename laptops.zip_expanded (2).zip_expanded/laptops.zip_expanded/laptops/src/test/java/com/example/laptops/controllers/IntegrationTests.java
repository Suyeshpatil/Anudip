package com.example.laptops.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import javax.validation.ValidationException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.laptops.model.Laptop;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class IntegrationTests {

	@Autowired
	LaptopController laptopController;

//create the data	
	@Test
	@Order(1)
	public void testCreate() {
		Laptop laptop = new Laptop("asus", "average");

		Laptop laptopResult = laptopController.laptopService.save(laptop);
		Assertions.assertThat(laptopResult);
	}
//read the Data
	@Test
	@Order(2)
	public void testread() {
	Iterable<Laptop> laptops = laptopController.read();
	Assertions.assertThat(laptops).first().hasFieldOrPropertyWithValue("laptopName", "asus");
 }
	//create,Delete the data
	@Test
	@Order(3)

	public void testDelete() {
		Laptop laptop = new Laptop("asus", "average");

		Laptop laptopResult = laptopController.create(laptop);

		Iterable<Laptop> laptops = laptopController.read();
		Assertions.assertThat(laptops).first().hasFieldOrPropertyWithValue("laptopName","asus");

		laptopController.delete(laptopResult.getId());
		Assertions.assertThat(laptopController.read()).isNotIn(laptop);
	}
	
	//for error HAndaling .
	@Test
	@Order(4)
	public void errorHandlingValidationExceptionThrown() {

		Assertions.assertThatExceptionOfType(ValidationException.class).isThrownBy(() -> laptopController.somethingIsWrong());
	}
}
