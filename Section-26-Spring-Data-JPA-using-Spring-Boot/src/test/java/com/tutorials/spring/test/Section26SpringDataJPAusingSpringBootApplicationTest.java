/**
 * 
 */
package com.tutorials.spring.test;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tutorials.spring.main.Section26SpringDataJPAusingSpringBootApplication;
import com.tutorials.spring.main.entities.Product;
import com.tutorials.spring.main.repositories.product.IProductRepository;

/**
 * @author Lenovo
 *
 */
@SpringBootTest(classes = Section26SpringDataJPAusingSpringBootApplication.class)
public class Section26SpringDataJPAusingSpringBootApplicationTest {

	@Autowired
	private IProductRepository productRepository;

	@Disabled
	@Test
	void saveProduct() {
		Product product = new Product("Apple TV", "TV", 5000);
		productRepository.save(product);
	}

	@Disabled
	@Test
	void getAllProductTest() {
		System.out.println("Welcome to spring boot project tutorials");
		List<Product> products = productRepository.findAll();
		System.out.println(products);
	}

	@Test
	void findByNameLikeAndPriceTest() {
		System.out.println("Welcome to spring boot project tutorials");
		List<Product> products = productRepository.findByNameLikeAndPrice("Apple TV", 5000);
		System.out.println(products);
	}
}
