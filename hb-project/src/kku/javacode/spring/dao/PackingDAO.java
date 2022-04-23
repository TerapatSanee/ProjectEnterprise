package kku.javacode.spring.dao;

import java.util.List;

import kku.javacode.spring.entity.Packing;

public interface PackingDAO {
	
	public List<Packing> getPacking();

	public Packing getPacking(int theId);

	public void savePacking(Packing thepacking);

}
