/**
 * 
 */
package com.tutorials.spring.main.controller.product;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorials.spring.main.entities.Product;
import com.tutorials.spring.main.repositories.product.IProductRepository;

/**
 * @author Lenovo <br/>
 *         URL : http://localhost:8080/productdetails/products/
 *         http://localhost:8080/productdetails/productById/2 <br/>
 *         When we use the @controller use the @ResponseBody to send the
 *         response<br/>
 *         when we use the @RestController we dont have to use @ResponseBody
 */
/*@Controller*/
@RestController
@RequestMapping(value = "/productdetails")
public class ProductRESTController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRESTController.class);

	@Autowired
	private IProductRepository productRepository;

	@RequestMapping(value = "/products/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	/*@ResponseBody*/
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@RequestMapping(value = "/productById/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		LOGGER.info("Finding product by id : " + id);
		return productRepository.findById(id).get();
	}

	@RequestMapping(value = "/productByName/{name}", method = RequestMethod.GET)
	public List<Product> getProductByName(@PathVariable("name") String name) {
		LOGGER.info("Finding product by name : " + name);
		return productRepository.findByName(name);
	}

	@RequestMapping(value = "/productByNameAndPrice/{name}&{price}", method = RequestMethod.GET)
	public List<Product> getProductByNameAndPrice(@PathVariable("name") String name,
			@PathVariable("price") double price) {
		LOGGER.info("Finding product by name : " + name + " and Price :" + price);
		return productRepository.findByNameLikeAndPrice(name, price);
	}

	@RequestMapping(value = "/productSave/", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@RequestMapping(value = "/productUpdate/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@RequestMapping(value = "/productDelete/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		productRepository.deleteById(id);
	}
}
