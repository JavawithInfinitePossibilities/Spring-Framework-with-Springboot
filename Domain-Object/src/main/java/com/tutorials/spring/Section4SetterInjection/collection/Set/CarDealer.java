/**
 * 
 */
package com.tutorials.spring.Section4SetterInjection.collection.Set;

import java.util.Set;

/**
 * @author Lenovo
 *
 */
public class CarDealer {

	private String name;
	private Set<String> models;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", models=" + models + "]";
	}

}
