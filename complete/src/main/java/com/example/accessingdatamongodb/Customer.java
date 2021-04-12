package com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;


public class Customer {

	@Id
	public String id;

	public String firstName;
	public String lastName;
	public Order order;
	//public List<Order> orders = new ArrayList<>();

	public Customer() {}

	public Customer(String firstName, String lastName, Order order) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.order = order;
	}
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return String.format(
				"Customer[id=%s, firstName='%s', lastName='%s']",
				id, firstName, lastName);
		/*return "Customer{ id=" + id + ", firstname= " + firstName + ", lastname= " + lastName +
				", order= " + order + "}";*/
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {this.id = id; }

}

