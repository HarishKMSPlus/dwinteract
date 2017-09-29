package splusDwInteract.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Dhiraj
 * info   : This is main controller [ It composes a message to the user, inserts it into a map and returns it ]
 */

@RestController
public class SplusDWInteractionApi {

	/**
	 * info : method is for api call
	 */
	
	@RequestMapping("/login")
	public Map<String,String> sample(@RequestParam(value="name", defaultValue="World") String productID) {
		
		System.out.println("hello, im in login ...");
		Map<String,String> result = new HashMap<String,String>();

		result.put("product_id   : ", "US007");
		result.put("product_name : ", "USSHO");

		System.out.println("\n___________________________\n");
		System.out.println("product_id   : "+result.get("product_id   : "));
		System.out.println("product_name : " + result.get("product_name : "));
		
		return result;
	}
	
	@RequestMapping("/connect")
	public String testConnection(@RequestParam(value="name", defaultValue="World") String product_id) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch (Exception e) {

			e.printStackTrace();
		}
		
		
		return null;
	}
}