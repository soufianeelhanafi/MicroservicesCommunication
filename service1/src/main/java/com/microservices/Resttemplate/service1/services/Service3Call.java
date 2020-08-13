package com.microservices.Resttemplate.service1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service 
public class Service3Call {
	


	@Autowired
	RestTemplate RestTemplateClient ; 
	
	// l'annotation @HystrixCommand c'est elle qui permet à Hystrix de surveiller les applles à la methode annoté 
	//elle ne marche qu'avec les class annoté avec @Service ou @Component 
	// le param fallbackMetode  permet de specifier quel methode il faudra appeler en cas d'erreur 
	@HystrixCommand(fallbackMethod = "erreurAppelService2")
	public String service3Call ()
	{
		return RestTemplateClient.getForObject("http://service3/pingService3", String.class) ;
		
	}
	
	public String erreurAppelService2 ()
	{
		return " the fall Back methode "  ;
		
	}


}
