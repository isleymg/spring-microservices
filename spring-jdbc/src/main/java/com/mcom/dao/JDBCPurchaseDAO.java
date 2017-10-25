package com.mcom.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mcom.domain.Purchase;



@Repository
public class JDBCPurchaseDAO implements PurchaseDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	
	@Override
	public Collection<Purchase> getAllPurchases() {
		
		return jdbcTemplate.query("select * from PURCHASES", new BeanPropertyRowMapper<Purchase>(Purchase.class));
	}

	@Override
	public Purchase getPurchase(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
