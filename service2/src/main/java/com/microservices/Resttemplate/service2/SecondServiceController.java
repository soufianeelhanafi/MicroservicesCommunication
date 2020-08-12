package com.microservices.Resttemplate.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecondServiceController {

	
	@GetMapping("/pingService2")
	public String getPingService ()
	{
		return "this is Service 2" ; 
	}
		
}
