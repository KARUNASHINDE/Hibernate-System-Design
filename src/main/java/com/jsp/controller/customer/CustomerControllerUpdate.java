package com.jsp.controller.customer;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerControllerUpdate {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setEmail("ktiud#fc@g");
		customer.setName("ural");
		
		
		CustomerService customerService = new CustomerService();
		Customer customer2= customerService.updateCustomer(customer, 3);
		if(customer2!=null) {
			System.out.println("record id update");
		}
		
		
		
	}

}
