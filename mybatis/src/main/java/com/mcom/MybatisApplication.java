package com.mcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@MapperScan("com.mcom")
public class MybatisApplication implements CommandLineRunner {
	
	@Autowired
	private Service svc; 


	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
		List<MusicItem> items = svc.getItems();
		for (MusicItem musicItem : items) {
			System.out.println(musicItem);
		}
	}
}
