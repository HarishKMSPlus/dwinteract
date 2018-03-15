package splusDwInteract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import splusDwInteract.model.Test;
import splusDwInteract.service.SplusTestService;

@RequestMapping("/test")
@RestController
public class TestController {


	@Autowired
	SplusTestService splusTestService;

	/**
	 * info : method is for api call
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity getStoreById(@PathVariable String id){			

	//	List<Test> test = splusTestService.getListOfStore(id);

		String test=id;
		if (test == null) {
			return new ResponseEntity("No products found", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(test, HttpStatus.OK);
	}
}
