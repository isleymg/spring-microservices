package com.mcom.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcom.domain.Purchase;
import com.mcom.service.PurchaseService;

@RestController
public class RestService {
	
	@Autowired
	private PurchaseService svc;
	
	@RequestMapping("/purchases")
	public Collection<Purchase> purchases() {
		return svc.findAllPurchases();
	}
}
