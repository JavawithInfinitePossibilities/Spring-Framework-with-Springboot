/**
 * 
 */
package com.tutorials.spring.main.BAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tutorials.spring.Section13InjectingInterfaces.BAO.IOrderBAO;
import com.tutorials.spring.Section13InjectingInterfaces.DAO.IOrderDAO;

/**
 * @author Lenovo
 *
 */
@Component("orderBAOImpl")
public class OrderBAOImpl implements IOrderBAO {

	@Autowired
	@Qualifier("orderCart")
	private IOrderDAO orderDao;

	@Override
	public void order() {
		System.out.println("This is Order bao");
		orderDao.orderDao();
	}

}
