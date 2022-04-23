package kku.javacode.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kku.javacode.spring.entity.Order_item;

@Repository
public class OrderItemDAOImpl implements OrderItemDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	public OrderItemDAOImpl() {
	}
	
	@Override
	public List<Order_item> getOrderItem() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Order_item> theQuery = currentSession.createQuery("from Order_item", Order_item.class);

		// execute query and get result list
		List<Order_item> Order_item = theQuery.getResultList();

		// return the results
		return Order_item;
	}

	@Override
	public Order_item getOrderItem(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read form database using the primary key
		Order_item theOrder_item = currentSession.get(Order_item.class, theId);

		return theOrder_item;
	}

	@Override
	public void deleteOrderItem(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<Order_item> theQuery = currentSession.createQuery("delete from Order_item where id=:Order_itemId", Order_item.class);
		theQuery.setParameter("Order_itemId", theId);

		theQuery.executeUpdate();

	}

	@Override
	public void saveOrderItem(Order_item theOrder_item) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/update the inventory ... finally
		currentSession.saveOrUpdate(theOrder_item);

	}
}
