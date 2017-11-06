package splusDwInteract.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import splusDwInteract.model.Test;
import splusDwInteract.repositories.SplusTestRepository;
import splusDwInteract.service.SplusTestService;

@Service
public class SplusTestServiceImpl implements SplusTestService{

	@Autowired
	SplusTestRepository splusTestRepository;
	
	public List<Test> getListOfStore(String id) {

		List<Test> listoftest = new ArrayList<Test>();
		
		//Test test = splusTestRepository.findOne(id);
		
		List<Test> list = splusTestRepository.getStore(id);
		
		//listoftest.add(test);
		
		return list;
	}

	
}
