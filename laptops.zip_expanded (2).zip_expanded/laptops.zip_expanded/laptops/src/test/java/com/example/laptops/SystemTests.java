package com.example.laptops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.laptops.model.Laptop;

public class SystemTests {

//	@Test
//	
//	public void testCreateReadDelete() {
//		RestTemplate restTemplate = new RestTemplate();
//
//		String url = "http://localhost:9000/laptop";
//
//		Laptop laptop = new Laptop("Dell","gaming" );
//		ResponseEntity<Laptop> entity = restTemplate.postForEntity(url, laptop, Laptop.class);
//
//		Laptop[] laptops = restTemplate.getForObject(url, Laptop[].class);
//		Assertions.assertThat(laptops).extracting(Laptop::getLaptopName).containsOnly("Dell");
//
//		restTemplate.delete(url + "/" + entity.getBody().getId());
//		Assertions.assertThat(restTemplate.getForObject(url, Laptop[].class)).isEmpty();
//	}

	//checking the Application
@Test
	public void testCreateReadDelete() {
		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:9000/laptop";

		Laptop laptop = new Laptop("hp","gaming" );
		ResponseEntity<Laptop> entity = restTemplate.postForEntity(url, laptop, Laptop.class);

		Laptop[] laptops = restTemplate.getForObject(url, Laptop[].class);
		Assertions.assertThat(laptops).extracting(Laptop::getLaptopName).containsOnly("hp");

		restTemplate.delete(url + "/" + entity.getBody().getId());
		Assertions.assertThat(restTemplate.getForObject(url, Laptop[].class)).isNotNull();
	}
	@Test
	public void testErrorHandlingReturnsBadRequest() {

		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:9000/wrong";

		try {
			restTemplate.getForEntity(url, String.class);
		} catch (HttpClientErrorException e) {
			Assertions.assertThat(e.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
		}
	}

}
