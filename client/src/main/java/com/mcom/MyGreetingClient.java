package com.mcom;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("my-api-gateway")
public interface MyGreetingClient {
	
	@RequestMapping("/api/greet")
	public String greet();
}

