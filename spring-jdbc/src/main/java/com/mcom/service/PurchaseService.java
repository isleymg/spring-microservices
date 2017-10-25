package com.mcom.service;

import java.util.Collection;

import com.mcom.domain.Purchase;

public interface PurchaseService {
	public Collection<Purchase> findAllPurchases();
	
}
