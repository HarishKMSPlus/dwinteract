package splusDwInteract.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import splusDwInteract.model.Store;
import splusDwInteract.services.SplusStoreService;

@Service
public class SplusStoreServiceImpl implements SplusStoreService{

	public Optional<List<Store>> getListOfStore() {

		Optional<List<Store>> optionDumyValue = null;
		
		return optionDumyValue;
	}

}
