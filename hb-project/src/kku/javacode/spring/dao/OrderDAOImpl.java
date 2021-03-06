package kku.javacode.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kku.javacode.spring.entity.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	public OrderDAOImpl() {
	}

	@Override
	public List<Order> getOrder() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Order> theQuery = currentSession.createQuery("from Order", Order.class);

		// execute query and get result list
		List<Order> Order = theQuery.getResultList();

		// return the results
		return Order;
	}

	@Override
	public Order getOrder(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read form database using the primary key
		Order theOrder = currentSession.get(Order.class, theId);

		return theOrder;
	}

	@Override
	public void deleteOrder(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<Order> theQuery = currentSession.createQuery("delete from Order where id=:Order_Id", Order.class);
		theQuery.setParameter("Order_Id", theId);

		theQuery.executeUpdate();

	}

	@Override
	public void saveOrder(Order theOrder) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(theOrder);

	}

	/*@Override
	public void saveOrder(String date, String theName, int theAmount) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<Order> theQuery = currentSession.createQuery("insert into from Order values(:date,:name,:amount", Order.class);
		theQuery.setParameter("date", date);
		theQuery.setParameter("name", theName);
		theQuery.setParameter("amount", theAmount);

		theQuery.executeUpdate();

	}*/
}
