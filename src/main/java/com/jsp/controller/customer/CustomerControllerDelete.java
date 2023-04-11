package com.jsp.controller.customer;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerControllerDelete {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		Customer customer = customerService.deleteCustomer(3);
		if (customer != null) {
			System.out.println("record id deleteed");
		}
	}

}
