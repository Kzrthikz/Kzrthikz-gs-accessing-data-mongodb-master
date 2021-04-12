package com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;


public class Order {

	@Id
	public String orderId;

	private String orderName;
	private double price;

	public Order() {}

	public Order(String orderId, String orderName, double price) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
	}

	public Order(String orderName, double price) {
		this.orderName = orderName;
		this.price = price;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderName() {
		return orderName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order{" +
				"orderId='" + orderId + '\'' +
				", orderName='" + orderName + '\'' +
				", price=" + price +
				'}';
	}

}

