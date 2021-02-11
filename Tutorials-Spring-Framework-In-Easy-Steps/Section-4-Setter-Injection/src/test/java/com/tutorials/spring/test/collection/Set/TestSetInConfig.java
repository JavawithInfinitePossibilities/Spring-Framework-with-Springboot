/**
 * 
 */
package com.tutorials.spring.test.collection.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorials.spring.Section4SetterInjection.collection.Set.CarDealer;

/**
 * @author Lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/Spring-Config.xml" })
public class TestSetInConfig {
	@Autowired
	ApplicationContext context;

	@Test
	public void testSetInConfig() {
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		System.out.println("Car dealer : " + carDealer + " Set type: " + carDealer.getModels().getClass());
	}
}
