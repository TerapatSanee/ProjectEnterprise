package kku.javacode.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kku.javacode.spring.dao.OrderItemDAO;
import kku.javacode.spring.entity.Order_item;

@Service
public class OrderItemServiceImpl implements OrderItemService{
	
	// need to inject inventory dao
	@Autowired
	private OrderItemDAO orderitemDAO;
	
	@Override
	@Transactional
	public List<Order_item> getOrderItem() {
		
		return orderitemDAO.getOrderItem();
	}

	@Override
	@Transactional
	public Order_item getOrderItem(int theId) {
		
		return orderitemDAO.getOrderItem(theId);
	}

	@Override
	@Transactional
	public void deleteOrderItem(int theId) {
		
		orderitemDAO.deleteOrderItem(theId);
		
	}

	@Override
	@Transactional
	public void saveOrderItem(Order_item theOrder_item) {
		
		orderitemDAO.saveOrderItem(theOrder_item);
	}

}
