/**
 * 
 */
package com.tutorials.spring.Section11StereotypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 *
 */
@Component
public class Instructor {
	@Value("#{T(java.lang.Math).abs(-120)}")
	private int id;
	@Value("Siddhant")
	private String name;
	@Autowired
	private Address address;
	@Value("#{departments}")
	private List<String> departments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", address=" + address + ", departments=" + departments
				+ "]";
	}

}
