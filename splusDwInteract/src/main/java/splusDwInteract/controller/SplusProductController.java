package splusDwInteract.controller;

import java.util.ArrayList;
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
import splusDwInteract.service.SplusProductDetailCustomService;
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
	SplusProductDetailCustomService splusProductDetailCustomService;

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
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity getProductById(@PathVariable String id) {

		System.out.println("in list getAllProducts ");

		Product productById = splusProductService.getListOfProductById(id);

		if (productById == null) {
			return new ResponseEntity("No products found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(productById, HttpStatus.OK);
	}

	/**
	 * This method will get the product of by its product details.
	 *@param productdetail id
	 *@return product
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public ResponseEntity getProductByProductDetail(@PathVariable String id) {

		ProductDetail productDetail= splusProductDetailService.getProductByProductDetailId(id);


		if (productDetail.getProduct() == null) {
			return new ResponseEntity("No products found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(productDetail.getProduct(), HttpStatus.OK);
	}

	//-------------------------------------------------------------------------------------------------------------------

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "{pid}/detail/{pdid}", method = RequestMethod.GET)
	public ResponseEntity getProductAndProductDetail(@PathVariable String pid,@PathVariable String pdid) {

		ProductDetail  productDetail = splusProductDetailCustomService.getProductDetailByProductId(pid,pdid);
		ProductDetail  productDetailx = new ProductDetail();
		Optional<ProductDetail> listOptional = Optional.ofNullable(null);
		
		if(productDetail.getProduct() != null) {

			if(pid.equals(productDetail.getProduct().getProductId())) {
				listOptional = Optional.ofNullable(productDetail);
				return new ResponseEntity(listOptional.get(), HttpStatus.OK);
			}else {
				listOptional = Optional.ofNullable(productDetailx);
				return new ResponseEntity("record not found", HttpStatus.OK);
			}
			
		}else {
			return new ResponseEntity("record not found", HttpStatus.OK);			
		}
	}
	
	/**
	 * This method will get all the product and product details
	 *@param 
	 *@return product and details
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ResponseEntity getProductAndProductDetail() {

		List<ProductDetail> productDetail = splusProductDetailService.getListOfProductDetails();
		
		System.out.println(">>>>>>"+productDetail);
		
		
		for (ProductDetail productDetailx : productDetail) {
			
			System.out.println("----->>>> product id :: "+productDetailx);
		}

		return new ResponseEntity(productDetail, HttpStatus.OK);
	}
	
	
	/**
	  * This method gets all the product details of that product 
	  * @param product id
	  * @return list of product detail
	  */
	  @SuppressWarnings({ "rawtypes", "unchecked" })
	  @RequestMapping(value = "/{id}/detail", method = RequestMethod.GET)
	  public ResponseEntity getProductDetailByProduct(@PathVariable String id) {
		  System.out.println(">>>>>>>>>>>hello");
	   List<ProductDetail> productDetailByProduct= splusProductDetailCustomService.getProductDetailByProduct(id);
	   
	   List<ProductDetail> listOfProductDetail = new ArrayList<ProductDetail>(); 

	   for (ProductDetail productDetail : productDetailByProduct) {

	    ProductDetail productDetailByProductId = splusProductDetailService.getProductDetailById(productDetail.getId());
	    listOfProductDetail.add(productDetailByProductId);
	   
	   }
	       if(listOfProductDetail.isEmpty()){
	       
	        return new ResponseEntity("No product detail found",HttpStatus.NOT_FOUND);
	       }
	   return new ResponseEntity(listOfProductDetail, HttpStatus.OK);

	  }
}

