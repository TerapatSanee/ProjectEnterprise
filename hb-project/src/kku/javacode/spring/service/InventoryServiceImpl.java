package kku.javacode.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kku.javacode.spring.dao.InventoryDAO;
import kku.javacode.spring.entity.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	// need to inject inventory dao
	@Autowired
	private InventoryDAO inventoryDAO;
	
	@Override
	@Transactional
	public List<Inventory> getInventory() {
		
		return inventoryDAO.getInventory();
	}

	@Override
	@Transactional
	public Inventory getInventory(int theId) {
		
		return inventoryDAO.getInventory(theId);
	}

	@Override
	@Transactional
	public void deleteItem(int theId) {
		
		inventoryDAO.deleteItem(theId);
		
	}

	@Override
	@Transactional
	public List<Inventory> searchItems(String theSearchName) {
		
		return inventoryDAO.searchItems(theSearchName);
	}

	@Override
	@Transactional
	public void tackoutItem(int theId, int pack, int newPack) {
		
		inventoryDAO.tackoutItems(theId,pack,newPack);
		
	}

	@Override
	@Transactional
	public void saveInventory(Inventory theinventory) {
		
		inventoryDAO.saveInventory(theinventory);
	}

}
