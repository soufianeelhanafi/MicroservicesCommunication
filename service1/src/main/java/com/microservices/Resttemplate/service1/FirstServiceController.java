package com.microservices.Resttemplate.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.Resttemplate.service1.services.Service2Call;
import com.microservices.Resttemplate.service1.services.Service3Call;


@RestController
public class FirstServiceController {

	@Autowired
	Service2Call service2  ; 
	
	@Autowired
	Service3Call service3 ; 


	@GetMapping("/pingService1")
	public String getPingService ()
	{
		String result="this is service 1 " ; 

		result += service2.service2Call();

		result+= "  " ; 


		//result += service3.service3Call() ;

		return result ; 
	}

}
