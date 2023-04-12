package com.cogent.spring.service;

import java.util.List;

import com.cogent.spring.entity.Item;

public interface ItemService {
	public Item save(Item item);
	public List<Item> fetch();
}
