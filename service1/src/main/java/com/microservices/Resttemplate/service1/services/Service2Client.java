package com.microservices.Resttemplate.service1.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// chaque interface client doit etre annoté avec cette annotation la , avec une propriété obligatoire qui s'appelle 
// name est qui fait reference au nom du microservice qu'on essaye d'appeler c'est le meme nom invoké au niveau du 
// service discovery si on a pas de service discovery il faudra absolument renseigner l'url 
@FeignClient(name = "service2")
public interface Service2Client {
	
	
	@GetMapping("/pingService2")
	String getThePingofService2 () ; 

}
