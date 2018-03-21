package splusDwInteract.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Store;
import splusDwInteract.service.SplusStoreService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.QueryParam;

/**
 * This is a REST controller,whenever user hits /store into the URL,the call arrives here.
 *
 * @author Dhiraj Bangar
 *
 */

@RestController
@RequestMapping("/store")
public class SplusStoreController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	SplusStoreService splusStoreService;
	
	
	/** This will get a list of all the stores
	 * @return list of stores
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity getAllStores(){	

		List<Store> listOfStore = splusStoreService.getListOfStore();
		
		System.out.println("list values : "+listOfStore);

		Optional<List<Store>> listOptional = Optional.ofNullable(listOfStore);
		System.out.println("list values : "+listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	@RequestMapping(value="/names", method=RequestMethod.GET)
	public String getStoreName(){	
		return "Manas Store";
	}

	/**
	 * This will get the store on the basis of store id
	 * @return a particular store 
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity getStoreById(@PathVariable String id){	

		System.out.println("in store controller");

		Store storeDetailById = splusStoreService.getListOfStoreById(id);
		
		if (storeDetailById == null) {
			return new ResponseEntity("No store found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(storeDetailById, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	@RequestMapping(value="/mytest",method=RequestMethod.GET)
	public ResponseEntity getStoreById(){	

		System.out.println("in store controller");

		Store storeDetailById2 = splusStoreService.getListOfStoreById("2");
		Store storeDetailById3 = splusStoreService.getListOfStoreById("3");
		Store storeDetailById4 = splusStoreService.getListOfStoreById("4");
		Store storeDetailById5 = splusStoreService.getListOfStoreById("5");
		Store storeDetailById6 = splusStoreService.getListOfStoreById("6");
		Store storeDetailById7 = splusStoreService.getListOfStoreById("7");
		Store storeDetailById8 = splusStoreService.getListOfStoreById("8");
		Store storeDetailById9 = splusStoreService.getListOfStoreById("9");
		Store storeDetailById10 = splusStoreService.getListOfStoreById("10");
		Store storeDetailById11 = splusStoreService.getListOfStoreById("11");
		
		List<Store> storeList=new ArrayList<Store>();
		storeList.add(storeDetailById2);
		storeList.add(storeDetailById3);
		storeList.add(storeDetailById4);
		storeList.add(storeDetailById5);
		storeList.add(storeDetailById6);
		storeList.add(storeDetailById7);
		storeList.add(storeDetailById8);
		storeList.add(storeDetailById9);
		storeList.add(storeDetailById10);
		storeList.add(storeDetailById11);
		
		if (storeList == null) {
			return new ResponseEntity("No store found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(storeList, HttpStatus.OK);
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	public ResponseEntity getStoreByProductId(@PathVariable String id){	

		System.out.println("in store controller");

		List<Store> stores = splusStoreService.getListOfStoreByProductId(id);
		
		if (stores == null) {
			return new ResponseEntity("No store found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(stores, HttpStatus.OK);
	}

	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/inventory", method=RequestMethod.GET)
	public ResponseEntity setStoreInventory(@QueryParam("storeId") String storeId,
											@QueryParam("variationId") int variationId,
											@QueryParam("quantity") int quantity
			){	

		System.out.println("in store controller"+storeId+"  :  "+variationId+" : "+quantity);

		
		return new ResponseEntity("done", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity saveCart(String json) {

		System.out.println("cart >>"+json);

		

		if (json == null) {
			return new ResponseEntity("No Cart found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity("done", HttpStatus.OK);

	}
}
