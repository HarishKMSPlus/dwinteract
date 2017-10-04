package splusDwInteract.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import splusDwInteract.model.Inventory;
import splusDwInteract.model.Store;
import splusDwInteract.repositories.SplusInventoryCustomRepository;
import splusDwInteract.repositories.SplusInventoryRepository;
import splusDwInteract.repositories.SplusStoreRepository;
import splusDwInteract.service.SplusInventoryService;

@Service
public class SplusInventoryServiceImpl implements SplusInventoryService{

	@Autowired
	SplusInventoryRepository splusInventoryRepository;
	
	@Autowired
	SplusInventoryCustomRepository splusInventoryCustomRepository;
	
	@Override
	public List<Inventory> getListOfInventory() {

		List<Inventory> list = splusInventoryRepository.findAll();
		return list;
	}

	@Override
	public Inventory getListOfInventoryById(String id) {
		Inventory inventoryById = splusInventoryRepository.findOne(id);
		
		return inventoryById;
	}

	@Override
	public Inventory getListOfInventoryBystoreId(String id) {

		Inventory inventoryById = splusInventoryCustomRepository.findBystoreId(id);
		
		return inventoryById;
	}
}
