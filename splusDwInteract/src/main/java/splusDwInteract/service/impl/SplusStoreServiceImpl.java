package splusDwInteract.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import splusDwInteract.model.Store;
import splusDwInteract.services.SplusStoreService;

@Service
public class SplusStoreServiceImpl implements SplusStoreService{

	public List<Store> getListOfStore() {

		
		List<Store> list = null;
		
		return null;
	}

	public List<String> getListOfString() {
		
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("456");
		
		return list;
	}

}
