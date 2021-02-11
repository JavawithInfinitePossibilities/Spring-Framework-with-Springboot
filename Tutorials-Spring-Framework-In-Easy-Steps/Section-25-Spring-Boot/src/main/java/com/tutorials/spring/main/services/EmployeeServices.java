/**
 * 
 */
package com.tutorials.spring.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.spring.main.dao.intf.IEmployeeDAO;
import com.tutorials.spring.main.services.imtf.IEmployeeServices;

/**
 * @author Lenovo
 *
 */
@Service
public class EmployeeServices implements IEmployeeServices {

	@Autowired
	IEmployeeDAO iEmployeeDAO;

	@Override
	public void save() {
		iEmployeeDAO.employeeSave();
	}

}
