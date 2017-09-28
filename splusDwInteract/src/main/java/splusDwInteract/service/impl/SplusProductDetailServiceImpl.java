package splusDwInteract.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import splusDwInteract.model.ProductDetail;
import splusDwInteract.repositories.SplusProductDetailRepository;
import splusDwInteract.service.SplusProductDetailService;

@Service
public class SplusProductDetailServiceImpl implements SplusProductDetailService{

	@Autowired
	SplusProductDetailRepository splusProductDetailRepository;

	@Override
	public List<ProductDetail> getListOfProductDetails() {
		List<ProductDetail> list = splusProductDetailRepository.findAll();
		return list;
	}

	@Override
	public ProductDetail getProductDetailById(String id) {

		ProductDetail list = splusProductDetailRepository.findById(id);
		
		return list;
	} 
	
	
}
