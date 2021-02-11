/**
 * 
 */
package com.tutorials.spring.test.xmlconfig;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorials.spring.Section5LifeCycleMethods.xmlconfig.Patient;

/**
 * @author Lenovo
 *
 */
public class TestLifeCycleXmlConfig {

	@Test
	public void testLifeCycleXmlConfig() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/Spring-Config.xml");
		Patient patient = (Patient) context.getBean("patientXml");
		System.out.println("Patient detial : " + patient);
		context.registerShutdownHook();
	}
}
