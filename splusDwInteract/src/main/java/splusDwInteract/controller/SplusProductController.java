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

import splusDwInteract.model.Product;
import splusDwInteract.model.ProductDetail;
import splusDwInteract.service.SplusProductDetailService;
import splusDwInteract.service.SplusProductService;

/**
 * This is a REST controller,whenever user hits /product into the URL,the call arrives here.
 *
 * @author Nehal.Shah
 *
 */

@RestController
@RequestMapping("/product")
public class SplusProductController {

	@Autowired
	SplusProductService splusProductService;

	@Autowired
	SplusProductDetailService splusProductDetailService;
	/**
	 * This will get a list all the products
	 * 
	 * @return list of products
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity getListOfProduct() {

		List<Product> listOfProduct = splusProductService.getListOfProduct();

		System.out.println("list values : " + listOfProduct);

		Optional<List<Product>> listOptional = Optional.ofNullable(listOfProduct);
		System.out.println("list values : " + listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	/**
	 * This will get the particular product by product id
	 * 
	 * @return product
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/productById/{id}", method = RequestMethod.GET)
	public ResponseEntity getProductById(@PathVariable String id) {

		System.out.println("in list getAllProducts ");

		Product productById = splusProductService.getListOfProductById(id);

		if (productById == null) {
			return new ResponseEntity("No products found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(productById, HttpStatus.OK);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public ResponseEntity getProductByProductDetail(@PathVariable String id) {
		
		ProductDetail productDetail= splusProductDetailService.getProductByProductDetailId(id);
		
		
		if (productDetail.getProduct() == null) {
			return new ResponseEntity("No products found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(productDetail.getProduct(), HttpStatus.OK);
	}
}
