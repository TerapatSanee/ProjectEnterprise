package kku.javacode.spring.service;

import java.util.List;

import kku.javacode.spring.entity.Order;

public interface OrderService {
	
	public List<Order> getOrder();
	
	public Order getOrder(int theId);
	
	public void deleteOrder(int theId);

	public void saveOrder(Order theOrder);

	//public void saveOrder(String date, String theName, int theAmount);


}
