package splusDwInteract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Inventory;
import splusDwInteract.model.Store;
import splusDwInteract.services.SplusInventoryService;

@RestController
@RequestMapping("/inventory")
public class SplusInventoryController {

//	@Autowired
//	SplusInventoryService splusInventoryService;
//	
//	@RequestMapping(value="/invDetail", method=RequestMethod.GET)
//	public Inventory getInventoryDetail(String id){	
//	
//		Inventory inventoryDetails = splusInventoryService.getInventoryDetail(id);
//		
//		return inventoryDetails;
//	}
	
}
