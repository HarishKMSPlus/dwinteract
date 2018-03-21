package splusDwInteract.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import splusDwInteract.model.Store;
import splusDwInteract.repositories.SplusStoreRepository;
import splusDwInteract.service.SplusStoreService;

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


	public Store getListOfStoreById(String id) {
	
		
		Store storeById = splusStoreRepository.findOne(id);
		
		return storeById;
	}

	@Override
	public List<Store> getListOfStoreByProductId(String id) {
		
		List<Store> stores=splusStoreRepository.findByProductId(id);
		
		return stores;
	}

	@Override
	public Store getStoreByStoreIdAndProductId(String storeId, String productId) {
		
		
		Store store=splusStoreRepository.findByStoreIdAndProductId(storeId, productId);
		return store;
	}

}
