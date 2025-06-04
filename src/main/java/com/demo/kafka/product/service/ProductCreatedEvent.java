package com.demo.kafka.product.service;

public class ProductCreatedEvent {

	private String productId;
	private String title;
	private double price;
	private int quantity;
	
	public ProductCreatedEvent() {
	}
	
	public ProductCreatedEvent(String productId, String title, double price, int quantity) {
		this.productId = productId;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
