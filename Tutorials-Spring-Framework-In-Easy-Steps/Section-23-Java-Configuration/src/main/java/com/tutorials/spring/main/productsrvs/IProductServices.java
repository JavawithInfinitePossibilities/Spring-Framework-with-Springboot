/**
 * 
 */
package com.tutorials.spring.main.productsrvs;

import java.util.List;

import com.tutorials.spring.main.module.entity.Product;

/**
 * @author Lenovo
 *
 */
public interface IProductServices {

	public int create(String name, String description, double price);

	public List<Product> loadAllProduct();
	
	public List<Product> getProduct(String productName);
}
