package com.jsp.controller.customer;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerControllerSave {
	public static void main(String[] args) {
		Customer customer = new Customer();

		customer.setEmail("Rushi@345gmail.com");
		customer.setName("Rushi");
		CustomerService customerService = new CustomerService();
		Customer customer2 = customerService.saveCustomer(customer);
		if (customer2 != null) {
			System.out.println("recorded added");
		}

	}

}
