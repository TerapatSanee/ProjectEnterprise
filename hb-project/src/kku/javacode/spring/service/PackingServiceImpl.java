package kku.javacode.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kku.javacode.spring.dao.PackingDAO;
import kku.javacode.spring.entity.Packing;


@Service
public class PackingServiceImpl implements PackingService{
	
	// need to inject inventory dao
	@Autowired
	private PackingDAO packingDAO;
	
	@Override
	@Transactional
	public List<Packing> getPacking() {
		
		return packingDAO.getPacking();
	}

	@Override
	@Transactional
	public Packing getPacking(int theId) {
		
		return packingDAO.getPacking(theId);
	}
	
	@Override
	@Transactional
	public void savePacking(Packing thepacking) {
		
		packingDAO.savePacking(thepacking);
	}

}
