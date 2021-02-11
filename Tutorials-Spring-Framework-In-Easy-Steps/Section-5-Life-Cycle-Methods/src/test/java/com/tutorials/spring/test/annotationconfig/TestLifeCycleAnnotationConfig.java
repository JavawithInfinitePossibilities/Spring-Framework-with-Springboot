/**
 * 
 */
package com.tutorials.spring.test.annotationconfig;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorials.spring.Section5LifeCycleMethods.annotationconfig.Patient;

/**
 * @author Lenovo
 *
 */
public class TestLifeCycleAnnotationConfig {

	@Test
	public void testLifeCycleXmlConfig() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/Spring-Config.xml");
		Patient patient = (Patient) context.getBean("patientAnnotation");
		System.out.println("Patient detial : " + patient);
		context.registerShutdownHook();
	}
}
