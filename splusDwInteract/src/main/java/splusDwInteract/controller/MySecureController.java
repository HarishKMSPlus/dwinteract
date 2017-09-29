package splusDwInteract.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * This a Rest Controller,whenever /rest in URL is hit, the call arrives here.
 * This provides the security.
 * @author Nehal.Shah
 *
 */

@RequestMapping("/rest")
@RestController
public class MySecureController {
	
	@GetMapping("/all")
	public String helloResource(){
		return "manas test";
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/secure/all")
	public String helloSecure(){
		return "secure resource";
	}

}
