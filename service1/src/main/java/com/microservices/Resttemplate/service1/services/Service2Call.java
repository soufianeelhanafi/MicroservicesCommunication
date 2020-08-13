package com.microservices.Resttemplate.service1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

// pour faire appel à Hystrix il faut que la classe soit annoté soit de @Service ou @Component
@Service 
public class Service2Call {
	
	

	@Autowired
	RestTemplate RestTemplateClient ; 
	
	// l'annotation @HystrixCommand c'est elle qui permet à Hystrix de surveiller les applles à la methode annoté 
	//elle ne marche qu'avec les class annoté avec @Service ou @Component 
	// le param fallbackMetode  permet de specifier quel methode il faudra appeler en cas d'erreur 
	@HystrixCommand(fallbackMethod = "service2CallFallback")
	public String service2Call ()
	{
		return RestTemplateClient.getForObject("http://service2/pingService2", String.class) ;
		
	}
	
	public String service2CallFallback ()
	{
		return " the fall Back methode "  ;
		
	}

}
