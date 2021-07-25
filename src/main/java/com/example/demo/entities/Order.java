package com.example.demo.entities;

public class Order {

	private String orderId;
	private String name;
	private String qty;
	private String price;
	
	public Order() {
		
	}
	public Order(String orderId, String name, String qty, String price) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
