package com.mcom.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcom.dao.PurchaseDAO;
import com.mcom.domain.Purchase;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseDAO dao;
	
	
	@Override
	public Collection<Purchase> findAllPurchases() {
		return dao.getAllPurchases();
	}

}
