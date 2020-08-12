package com.microservices.Resttemplate.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class Service1Application 
{
	
	@LoadBalanced
	 @Bean
	 RestTemplate restTemplate() {
	     return new RestTemplate();
	}

	public static void main( String[] args )
    {
    	SpringApplication.run(Service1Application.class, args);
    }
}
