package com.cogent.spring.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Item {
	private int itemid;
	private String name;
	private Double price;
	private int qty;
	
	public Item(int itemid, String name, Double price, int qty) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
