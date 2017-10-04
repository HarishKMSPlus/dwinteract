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

import splusDwInteract.model.ProductDetail;
import splusDwInteract.service.SplusProductDetailService;

/**
 * This is a REST controller,whenever user hits /productDetail into the URL,the call arrives here.
 *
 * @author Dhiraj Bangar
 *
 */

@RestController
@RequestMapping("/productDetail")
public class SplusProductDetailController {

	@Autowired
	SplusProductDetailService splusProductDetailService;

	/**
	 * This will get a list all the productdetails
	 * @return list of all the productdetails
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity getAllProductDetail() {

		List<ProductDetail> listOfProductDetail = splusProductDetailService.getListOfProductDetails();

		System.out.println("list values : " + listOfProductDetail);

		Optional<List<ProductDetail>> listOptional = Optional.ofNullable(listOfProductDetail);
		System.out.println("list values : " + listOptional);

		return new ResponseEntity(listOptional.get(), HttpStatus.OK);
	}

	/**
	 * This will get the particular productdetail by productdetail id
	 * @return productdetail
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/productDetailById/{id}", method = RequestMethod.GET)
	public ResponseEntity getProductDetailsById(@PathVariable String id) {

		ProductDetail productDetailById = splusProductDetailService.getProductDetailById(id);

		if (productDetailById == null) {
			return new ResponseEntity("No ProductDetail found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(productDetailById, HttpStatus.OK);
	}
}
