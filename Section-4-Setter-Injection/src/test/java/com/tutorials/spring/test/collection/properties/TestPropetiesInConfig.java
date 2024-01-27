/**
 * 
 */
package com.tutorials.spring.test.collection.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorials.spring.Section4SetterInjection.collection.properties.CountryAndLanguage;

/**
 * @author Lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/Spring-Config.xml" })
public class TestPropetiesInConfig {
	@Autowired
	ApplicationContext context;

	@Test
	public void testPropertyInConfig() {
		CountryAndLanguage countryAndLanguage = (CountryAndLanguage) context.getBean("countryAndLanguages");
		System.out.println("Country and their language : " + countryAndLanguage);
	}
}
