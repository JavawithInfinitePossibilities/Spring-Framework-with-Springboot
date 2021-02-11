package com.tutorials.spring.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tutorials.spring.main.Section25SpringBootApplication;
import com.tutorials.spring.main.services.imtf.IEmployeeServices;

@SpringBootTest(classes = Section25SpringBootApplication.class)
class Section25SpringBootApplicationTest {

	@Autowired
	IEmployeeServices iEmplyeeServices;

	@Test
	void test() {
		System.out.println("Welcome to spring boot project tutorials");
		iEmplyeeServices.save();
	}
}
