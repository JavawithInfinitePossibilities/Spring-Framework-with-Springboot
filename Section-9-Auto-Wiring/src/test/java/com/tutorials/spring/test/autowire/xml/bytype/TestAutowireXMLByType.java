/**
 * 
 */
package com.tutorials.spring.test.autowire.xml.bytype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorials.spring.Section9AutoWiring.xml.bean.Employee;

/**
 * @author Lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/Spring-Config.xml" })
public class TestAutowireXMLByType {

	@Autowired
	ApplicationContext context;

	@Test
	public void testAutowireXMLByType() {
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Employee detial : " + employee);
	}
}
