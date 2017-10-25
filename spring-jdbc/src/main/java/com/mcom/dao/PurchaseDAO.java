package com.mcom.dao;

import java.util.Collection;

import com.mcom.domain.Purchase;

public interface PurchaseDAO {
	public Collection<Purchase> getAllPurchases();
	public Purchase getPurchase(int id);
	
	
	
}
