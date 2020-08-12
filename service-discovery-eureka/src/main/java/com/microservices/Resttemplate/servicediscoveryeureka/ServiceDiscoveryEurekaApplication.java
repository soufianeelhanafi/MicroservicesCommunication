package com.microservices.Resttemplate.servicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryEurekaApplication.class, args);
	}

}
