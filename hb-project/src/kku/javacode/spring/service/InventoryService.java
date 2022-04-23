package kku.javacode.spring.service;

import java.util.List;

import kku.javacode.spring.entity.Inventory;

public interface InventoryService {
	
	public List<Inventory> getInventory();
	
	public Inventory getInventory(int theId);

	public void deleteItem(int theId);

	public List<Inventory> searchItems(String theSearchName);

	public void tackoutItem(int theId, int pack, int newPack);

	public void saveInventory(Inventory theinventory);


}
