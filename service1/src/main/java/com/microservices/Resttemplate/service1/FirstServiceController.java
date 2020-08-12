package com.microservices.Resttemplate.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.Resttemplate.service1.services.Service2Client;
import com.microservices.Resttemplate.service1.services.Service3Client;


@RestController
public class FirstServiceController {

//	@Autowired
//	RestTemplate RestTemplateClient ; 
	
	@Autowired
	Service2Client service2Client ; 
	
	@Autowired
	Service3Client service3Client ; 
	
	
	@GetMapping("/pingService1")
	public String getPingService ()
	{
		String result="this is service 1 " ; 
		
		result += service2Client.getThePingofService2() ; 
		
		result+= "  " ;
		
		
		result += service3Client.getThePingofService3() ;
		
		return result ; 
	}
		
}
