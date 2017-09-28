package splusDwInteract.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Product;
import splusDwInteract.service.SplusProductService;

@RestController
@RequestMapping("/product")
public class SplusProductController {

	@Autowired
	SplusProductService splusProductService; 
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/getAllProducts", method=RequestMethod.GET)
	public ResponseEntity getListOfStore(){	

		List<Product> listOfString = splusProductService.getListOfProduct();
		
		System.out.println("list values : "+listOfString);

		Optional<List<Product>> listOptional = Optional.ofNullable(listOfString);
		System.out.println("list values : "+listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/listOfProductWithId", method=RequestMethod.GET)
	public ResponseEntity getListOfStoreWithId(){	

		System.out.println("in list getAllContainers controller");

		Product productDetailById = splusProductService.getListOfProductById("2");
		
		if (productDetailById == null) {
			return new ResponseEntity("No products found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(productDetailById, HttpStatus.OK);
	}

}
