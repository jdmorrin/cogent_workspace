package com.cogent.spring.service;

import java.util.List;

import com.cogent.spring.entity.Item;
import com.cogent.spring.repository.ItemReposetory;

public class ItemServiceImpl implements ItemService{

	private ItemReposetory repo;
	@Override
	public Item save(Item item) {
		// TODO Auto-generated method stub
		return repo.save(item);
	}

	@Override
	public List<Item> fetch() {
		// TODO Auto-generated method stub
		return (List<Item>)repo.findAll();
	}
	
}
