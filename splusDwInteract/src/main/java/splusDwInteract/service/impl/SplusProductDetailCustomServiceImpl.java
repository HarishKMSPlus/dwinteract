package splusDwInteract.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import splusDwInteract.model.ProductDetail;
import splusDwInteract.repositories.SplusProductDetailCustomRepository;
import splusDwInteract.service.SplusProductDetailCustomService;

@Service
public class SplusProductDetailCustomServiceImpl implements SplusProductDetailCustomService{

	@Autowired
	SplusProductDetailCustomRepository splusProductDetailCustomRepository;
	
	@Override
	public List<ProductDetail> getProductDetailByProduct(String id) {

		System.out.println("----> in service ");
		List<ProductDetail> listOfDetails = splusProductDetailCustomRepository.getProductDetail(id);
		
		return listOfDetails;
	}

}
