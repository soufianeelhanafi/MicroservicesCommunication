package com.microservices.Resttemplate.service1.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( name= "service3")
public interface Service3Client {
	
	@GetMapping("/pingService3")
	String getThePingofService3 () ; 

	
}
