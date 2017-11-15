package com.main.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Product {
	@Id
	@Column(name = "QUANTITY", length = 150, nullable = false)
	private int quantity;
	@Column(name = "PRICE", length = 150, nullable = false)
	private float price;
	@Column(name = "ITEM_NAME", length = 150)
	private String itemName;
	@GeneratedValue
	@Column(name = "ITEM_NUMBER")
	private int itemNumber;

	private int stock;

	public Product(int quantity, float price, String itemName,  int stock) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.itemName = itemName;
		
		this.stock = stock;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
