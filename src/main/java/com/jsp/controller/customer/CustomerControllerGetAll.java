package com.jsp.controller.customer;

import com.jsp.service.CustomerService;

public class CustomerControllerGetAll {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		customerService.getAllCustomer();
		
		}

}
