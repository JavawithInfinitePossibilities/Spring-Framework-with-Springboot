/**
 * 
 */
package com.tutorials.spring.test.interfaceconfig;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorials.spring.Section5LifeCycleMethods.interfaceconfig.Patient;

/**
 * @author Lenovo
 *
 */
public class TestLifeCycleInterfaceConfig {

	@Test
	public void testLifeCycleXmlConfig() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/Spring-Config.xml");
		Patient patient = (Patient) context.getBean("patientInterface");
		System.out.println("Patient detial : " + patient);
		context.registerShutdownHook();
	}
}
