package kku.javacode.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kku.javacode.spring.dao.OrderDAO;
import kku.javacode.spring.entity.Order;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	@Transactional
	public List<Order> getOrder() {
		
		return orderDAO.getOrder();
	}

	@Override
	@Transactional
	public Order getOrder(int theId) {
		
		return orderDAO.getOrder(theId);
	}

	@Override
	@Transactional
	public void deleteOrder(int theId) {
		
		orderDAO.deleteOrder(theId);
		
	}

	@Override
	@Transactional
	public void saveOrder(Order theOrder) {
		
		orderDAO.saveOrder(theOrder);
	}

	/*@Override
	@Transactional
	public void saveOrder(String date, String theName, int theAmount) {
		
		orderDAO.saveOrder(date,theName,theAmount);
		
	}*/


}
