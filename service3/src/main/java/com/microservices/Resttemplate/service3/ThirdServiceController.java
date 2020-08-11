package com.microservices.Resttemplate.service3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdServiceController {
	
@GetMapping("/pingService3")
public String getPingService1 ()
{
	return "this is Service 3" ; 
}
	

}
