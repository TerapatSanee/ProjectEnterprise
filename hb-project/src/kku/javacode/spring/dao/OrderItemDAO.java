package kku.javacode.spring.dao;

import java.util.List;

import kku.javacode.spring.entity.Order_item;

public interface OrderItemDAO {
	
	public List<Order_item> getOrderItem();

	public Order_item getOrderItem(int theId);

	public void deleteOrderItem(int theId);

	public void saveOrderItem(Order_item theorderitem);

}
