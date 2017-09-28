package splusDwInteract.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import splusDwInteract.model.Product;
import splusDwInteract.repositories.SplusProductRepository;
import splusDwInteract.service.SplusProductService;

@Service
public class SplusProductServiceImpl implements SplusProductService{

	@Autowired
	SplusProductRepository splusProductRepository; 
	
	@Override
	public List<Product> getListOfProduct() {

		List<Product> list = splusProductRepository.findAll();
		return list;
	}

//	@Override
//	public Product getListOfProductById(String i) {
//		
//		Product productDetail = splusProductRepository.findById(i);
//		return productDetail;
//	}

}
