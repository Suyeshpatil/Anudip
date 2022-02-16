package com.example.laptops.dao;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.laptops.model.Laptop;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DaoTests {

  @Autowired
  LaptopRepository laptopRepository;
//to check the Dao and testing create read delete.
  @Test
  public void testCreateReadDelete() {
    Laptop laptop = new Laptop("asus", "Average");

    laptopRepository.save(laptop);

    Iterable<Laptop> laptops = laptopRepository.findAll();
    Assertions.assertThat(laptops).extracting(Laptop::getLaptopName).containsOnly("asus");

    laptopRepository.deleteAll();
    Assertions.assertThat(laptopRepository.findAll()).isEmpty();
  }
}
