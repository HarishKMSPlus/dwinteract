package splusDwInteract.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Inventory;
import splusDwInteract.model.Store;
import splusDwInteract.service.SplusInventoryService;

@RestController
@RequestMapping("/inventory")
public class SplusInventoryController {

	@Autowired 
	SplusInventoryService splusInventoryService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/getAllInventory", method=RequestMethod.GET)
	public ResponseEntity getListOfStore(){	

		List<Inventory> listOfString = splusInventoryService.getListOfInventory();
		
		System.out.println("list values : "+listOfString);

		Optional<List<Inventory>> listOptional = Optional.ofNullable(listOfString);
		System.out.println("list values : "+listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/listOfInventoryWithId", method=RequestMethod.GET)
	public ResponseEntity getListOfStoreWithId(){	

		System.out.println("inventory by  Id:");

		Inventory InventoryDetailById = splusInventoryService.getListOfInventoryById("2");
		
		if (InventoryDetailById == null) {
			return new ResponseEntity("No Inventory found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(InventoryDetailById, HttpStatus.OK);
	}

}
