package kku.javacode.spring.service;

import java.util.List;

import kku.javacode.spring.entity.Packing;

public interface PackingService {
	
	public List<Packing> getPacking();
	
	public Packing getPacking(int theId);

	public void savePacking(Packing thepacking);


}
