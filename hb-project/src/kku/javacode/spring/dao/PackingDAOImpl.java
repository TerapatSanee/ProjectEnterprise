package kku.javacode.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kku.javacode.spring.entity.Packing;

@Repository
public class PackingDAOImpl implements PackingDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	public PackingDAOImpl() {
	}
	
	@Override
	public List<Packing> getPacking() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Packing> theQuery = currentSession.createQuery("from Packing ORDER BY pack", Packing.class);

		// execute query and get result list
		List<Packing> packing = theQuery.getResultList();

		// return the results
		return packing;
	}

	@Override
	public Packing getPacking(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read form database using the primary key
		Packing thePacking = currentSession.get(Packing.class, theId);

		return thePacking;
	}
	
	@Override
	public void savePacking(Packing thepacking) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/update the inventory ... finally
		currentSession.saveOrUpdate(thepacking);

	}
}
