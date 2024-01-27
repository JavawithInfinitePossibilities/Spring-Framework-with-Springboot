/**
 * 
 */
package com.tutorials.spring.test.usingreftypeambiguity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorials.spring.Section7ConstructorInjection.reftypeambiguity.Employee;

/**
 * @author Lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/Spring-Config.xml" })
public class TestUsingReftypeAmbiguity {
	@Autowired
	ApplicationContext context;

	@Test
	public void testConstractorInjectionUsingCNameSpace() {
		Employee employee = (Employee) context.getBean("employeeReftypeambiguity");
		System.out.println("Employee detial : " + employee);
	}
}
