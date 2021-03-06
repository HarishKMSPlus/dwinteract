package splusDwInteract.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Inventory;
import splusDwInteract.service.SplusInventoryService;

/**
 * This is a REST controller, whenever user hits /inventory into the URL,the call arrives here.
 * @author Nehal.Shah
 */

@RestController
@RequestMapping("/inventory")
public class SplusInventoryController {

	@Autowired 
	SplusInventoryService splusInventoryService;

	/**
	 * This will get all inventories 
	 * @return list of inventories
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity getAllInventoies(){	

		List<Inventory> listOfInventory = splusInventoryService.getListOfInventory();

		System.out.println("list values : "+listOfInventory);

		Optional<List<Inventory>> listOptional = Optional.ofNullable(listOfInventory);
		System.out.println("list values : "+listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	/**
	 * This will get the particular inventory by inventory id
	 * @return inventory
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity getInventoryById(@PathVariable String id){	

		System.out.println("inventory by  Id:");

		Inventory InventoryDetailById = splusInventoryService.getListOfInventoryById(id);

		Optional<Inventory> listOptional = Optional.ofNullable(InventoryDetailById);

		if (InventoryDetailById == null) {
			return new ResponseEntity("No record found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	/**
	 * This will get the particular inventory by inventory id
	 * @return inventory
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/store/{id}", method=RequestMethod.GET)
	public ResponseEntity getInventoryByStoreId(@PathVariable String id){	

		System.out.println("inventory by store Id:");

		Inventory inventoryDetailByStoreId = splusInventoryService.getListOfInventoryBystoreId(id);
		System.out.println(">>>>>>>>>"+inventoryDetailByStoreId);
		Inventory inventoryDetailById = null;
		Optional<Inventory> listOptional = Optional.ofNullable(null);

		if(inventoryDetailByStoreId != null) {
			System.out.println("in ifffffff");
			inventoryDetailById = splusInventoryService.getListOfInventoryById(inventoryDetailByStoreId.getId());
			listOptional = Optional.ofNullable(inventoryDetailById);

			return new ResponseEntity(listOptional.get(), HttpStatus.NOT_FOUND);

		}else {
			System.out.println("in elseeeeeee");
			return new ResponseEntity("No record found", HttpStatus.NOT_FOUND);
		}
	}
}
