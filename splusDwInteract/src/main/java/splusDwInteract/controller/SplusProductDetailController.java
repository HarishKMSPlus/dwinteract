package splusDwInteract.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.ProductDetail;
import splusDwInteract.service.SplusProductDetailService;

@RestController
@RequestMapping("/productDetail")
public class SplusProductDetailController {

	@Autowired
	SplusProductDetailService splusProductDetailService;
	
	//To get all productdetail of all product 
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/getAllProductDetail", method=RequestMethod.GET)
	public ResponseEntity getListOfStore(){	

		List<ProductDetail> listOfString = splusProductDetailService.getListOfProductDetails();
		
		System.out.println("list values : "+listOfString);

		Optional<List<ProductDetail>> listOptional = Optional.ofNullable(listOfString);
		System.out.println("list values : "+listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	//To get productdetail of a product on the basis of product id 
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/productDetailWithId", method=RequestMethod.GET)
	public ResponseEntity getProductDetailsById(){	

		ProductDetail productDetailById = splusProductDetailService.getProductDetailById("2");
		
		if (productDetailById == null) {
			return new ResponseEntity("No Inventory found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(productDetailById, HttpStatus.OK);
	}
}
