/**
 * 
 */
package com.tutorials.spring.main.DAO;

import org.springframework.stereotype.Component;

import com.tutorials.spring.Section13InjectingInterfaces.DAO.IOrderDAO;

/**
 * @author Lenovo
 *
 */
@Component("orderDaoImpl")
public class OrderDaoImpl implements IOrderDAO {

	@Override
	public void orderDao() {
		System.out.println("This is Order impl DAO.");
	}

}
