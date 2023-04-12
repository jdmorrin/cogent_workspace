package com.cogent.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.entity.Item;
import com.cogent.spring.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemController {
	@Autowired
	private ItemService service;
	
	@PostMapping("/items")
	public Item add(@RequestBody Item item) {
		
		return service.save(item);
	}
	
	@GetMapping("/items")
	public List<Item> findAll(){
		return service.fetch();
	}
	
	@PutMapping("/items")
	public Item edit(@RequestBody Item item) {
		return service.save(item);
	}
}
