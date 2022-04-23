package kku.javacode.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kku.javacode.spring.entity.Inventory;

@Repository
public class InventoryDAOImpl implements InventoryDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	public InventoryDAOImpl() {
	}
	
	@Override
	public List<Inventory> getInventory() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Inventory> theQuery = currentSession.createQuery("from Inventory ORDER BY pack", Inventory.class);

		// execute query and get result list
		List<Inventory> inventory = theQuery.getResultList();

		// return the results
		return inventory;
	}

	@Override
	public Inventory getInventory(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read form database using the primary key
		Inventory theInventory = currentSession.get(Inventory.class, theId);

		return theInventory;
	}

	@Override
	public void deleteItem(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<Inventory> theQuery = currentSession.createQuery("delete from Inventory where id=:inventoryId");
		theQuery.setParameter("inventoryId", theId);

		theQuery.executeUpdate();

	}

	@Override
	public List<Inventory> searchItems(String theSearchName) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery = null;

		//
		// only search by name if theSearchName is not empty
		//
		if (theSearchName != null && theSearchName.trim().length() > 0) {

			// search for name or type or details ... case insensitive
			theQuery = currentSession.createQuery(
					"from Inventory where lower(name) like :theName",
					Inventory.class);
			theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");

		} else {
			// theSearchName is empty ... so just get all customers
			theQuery = currentSession.createQuery("from Inventory", Inventory.class);
		}

		// execute query and get result list
		List<Inventory> inventory = theQuery.getResultList();

		// return the results
		return inventory;
	}

	@Override
	public void tackoutItems(int theId, int pack, int newPack) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		if (pack <= 0 || newPack <= 0) {

		} else {
			// takeout object with primary key
			Query<Inventory> theQuery = currentSession
					.createQuery("update Inventory set pack = pack-:newPack where id=:inventoryId");
			theQuery.setParameter("inventoryId", theId);
			theQuery.setParameter("newPack", newPack);
			theQuery.executeUpdate();
		}

	}

	@Override
	public void saveInventory(Inventory theinventory) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/update the inventory ... finally
		currentSession.saveOrUpdate(theinventory);

	}
}
