package com.microservices.Resttemplate.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class FirstServiceController {

	@Autowired
	RestTemplate RestTemplateClient ; 
	
	
	@GetMapping("/pingService1")
	public String getPingService ()
	{
		String result="this is service 1 " ; 
		
		result += RestTemplateClient.getForObject("http://service2/pingService2", String.class) ;
		
		result+= "  " ;
		
		
		result += RestTemplateClient.getForObject("http://service3/pingService3", String.class) ;
		
		return result ; 
	}
		
}
