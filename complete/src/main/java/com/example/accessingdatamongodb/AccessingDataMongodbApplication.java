package com.example.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	//@Autowired
	//private OrderRepository orderRepository;

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();
		//orderRepository.deleteAll();
		//orderService.deleteOrderById();
		//System.out.println(orderService.createOrder(new Order("iPhone", 200.03)));


		// save a couple of customers
		repository.save(new Customer("Alice", "Smith", new Order("Laptop A", 200.20)));
		repository.save(new Customer("Bob", "Smith", new Order("Laptop B", 300.30)));
		//orderRepository.save(new Order("Laptop A", 200.20));
		//orderRepository.save(new Order("Laptop B", 300.30));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		//fetch all orders
		/*System.out.println("Orders found with findAll():");
		System.out.println("-------------------------------");
		for (Order order : orderRepository.findAll()) {
			System.out.println(order);
		}
		System.out.println();*/

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}

		// fetch an individual order
		//System.out.println("Order found with findByOrderName('Laptop A'):");
		//System.out.println("--------------------------------");
		//System.out.println(orderRepository.findByOrderName("Laptop A"));

	}

}
