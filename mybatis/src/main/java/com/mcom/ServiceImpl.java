package com.mcom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ServiceImpl implements Service {
	@Autowired
	private MusicItemMapper mapper;
	
	
	@Override
	public List<MusicItem> getItems() {
		System.out.println("App running.....");
		List<MusicItem> items = this.mapper.findByCat("Pop");
		return items;
	}

}
