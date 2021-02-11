/**
 * 
 */
package com.tutorials.spring.main.dao;

import org.springframework.stereotype.Component;

import com.tutorials.spring.main.dao.intf.IEmployeeDAO;

/**
 * @author Lenovo
 *
 */
@Component
public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public void employeeSave() {
		System.out.println("This is a DAO class");
	}

}
