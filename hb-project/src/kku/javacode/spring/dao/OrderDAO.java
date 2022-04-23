package kku.javacode.spring.dao;

import java.util.List;

import kku.javacode.spring.entity.Order;

public interface OrderDAO {
	
	public List<Order> getOrder();

	public Order getOrder(int theId);

	public void deleteOrder(int theId);

	public void saveOrder(Order theOrder);

	//public void saveOrder(String date, String theName, int theAmount);

}
