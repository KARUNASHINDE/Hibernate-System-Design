package com.jsp.controller.customer;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerControllerGetbyId {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		Customer customer = customerService.getCustomerById(4);
		if (customer != null) {
			System.out.println(customer.getEmail());
			System.out.println(customer.getId());
			System.out.println(customer.getName());
		}
	}

}
