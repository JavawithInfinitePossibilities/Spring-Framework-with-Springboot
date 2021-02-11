/**
 * 
 */
package com.tutorials.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorials.spring.Section6DependencyCheckInnerbeansandScopes.Prescription;

/**
 * @author Lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/Spring-Config.xml" })
public class TestDependencyCheck {

	@Autowired
	ApplicationContext context;

	@Test
	public void testDependencyCheck() {
		Prescription patient = (Prescription) context.getBean("patient");
		System.out.println("Patient detial : " + patient);
	}
}
