package splusDwInteract.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Store;
import splusDwInteract.service.SplusStoreService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/store")
public class SplusStoreController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	SplusStoreService splusStoreService;

	@RequestMapping(value="/names", method=RequestMethod.GET)
	public String getStoreName(){	
		return "Manas Store";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/getAllStore", method=RequestMethod.GET)
	public ResponseEntity getListOfStore(){	

		List<Store> listOfString = splusStoreService.getListOfStore();
		
		System.out.println("list values : "+listOfString);

		Optional<List<Store>> listOptional = Optional.ofNullable(listOfString);
		System.out.println("list values : "+listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/listOfStoreWithId", method=RequestMethod.GET)
	public ResponseEntity getListOfStoreWithId(){	

		System.out.println("in list getAllContainers controller");

		Store storeDetailById = splusStoreService.getListOfStoreById(2);
		
		if (storeDetailById == null) {
			return new ResponseEntity("No Containers found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(storeDetailById, HttpStatus.OK);
	}

}
