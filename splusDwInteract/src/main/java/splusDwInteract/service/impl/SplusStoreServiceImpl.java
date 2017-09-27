package splusDwInteract.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import splusDwInteract.model.Store;
import splusDwInteract.repositories.SplusStoreRepository;
import splusDwInteract.services.SplusStoreService;

@Service
public class SplusStoreServiceImpl implements SplusStoreService{

	@Autowired
	SplusStoreRepository splusStoreRepository;
	
	public List<Store> getListOfStore() {

		
		List<Store> list = splusStoreRepository.findAll();
		
		return list;
	}

	public List<String> getListOfString() {
		
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		
		return list;
	}

	public Store getListOfStoreById(int id) {
	
		
		Store storeById = splusStoreRepository.findOne(id);
		
		return storeById;
	}

}
