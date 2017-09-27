package splusDwInteract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Store;
import splusDwInteract.services.SplusStoreService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/store")
public class SplusStoreController {
	
	@Autowired
	SplusStoreService splusStoreService;
	
	@RequestMapping(value="/names", method=RequestMethod.GET)
	public String getStoreName(){	
		return "Manas Store";
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public Optional<List<Store>> getListOfStore(){	
	
		List<Store> listOfString = splusStoreService.getListOfStore();
		System.out.println("list values : "+listOfString);
    	Optional<List<Store>> listOptional = Optional.ofNullable(listOfString);
    	//List<String> listOfString = splusStoreService.getListOfString();
    	System.out.println("list values : "+listOptional);
		
		return listOptional;
	}
	
	@RequestMapping(value="/listOfStoreWithId", method=RequestMethod.GET)
	public String getListOfStoreWithId(){	
	
		return null;
	}

}
