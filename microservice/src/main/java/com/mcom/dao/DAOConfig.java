package com.mcom.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfig {
	@Bean 
	JdbcTemplate jdbcTemplate (DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
}
