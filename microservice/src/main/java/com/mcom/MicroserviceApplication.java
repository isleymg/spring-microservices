package com.mcom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class MicroserviceApplication {

	@Value("${app.greeting}")
	private String greeting;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}
	
	@RequestMapping("/greet")
	public String greeting() {
		return greeting + " from " + System.getProperty("server.port");
	}
}
