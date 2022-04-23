package kku.javacode.spring.dao;

import java.util.List;

import kku.javacode.spring.entity.Inventory;

public interface InventoryDAO {
	
	public List<Inventory> getInventory();

	public Inventory getInventory(int theId);

	public void deleteItem(int theId);

	public List<Inventory> searchItems(String theSearchName);

	public void tackoutItems(int theId, int pack, int newPack);

	public void saveInventory(Inventory theinventory);

}
