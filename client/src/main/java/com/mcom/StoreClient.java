package com.mcom;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mcom.domain.Purchase;

@FeignClient("api-gateway")
public interface StoreClient {
	
	
	@RequestMapping("/api/purchases")
	public Collection<Purchase> purchases();
}
