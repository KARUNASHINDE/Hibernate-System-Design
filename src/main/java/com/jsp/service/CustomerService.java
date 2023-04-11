package com.jsp.service;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	public Customer saveCustomer(Customer customer) {
		if (customer != null) {
			return customerDao.saveCustomer(customer);
		}
		return null;
	}

	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	public Customer updateCustomer(Customer customer, int id) {
		Customer customer2 = customerDao.getCustomerById(id);
		if (customer.getName() != null)
			customer2.setName(customer.getName());
		if (customer.getEmail() != null)
			customer2.setEmail(customer.getEmail());
		if (customer2 != null) {
			return customerDao.updateCustomer(customer2);
		}
		return null;
	}
	public Customer deleteCustomer(int id) {
		Customer customer= customerDao.getCustomerById(id);
		if(customer!=null) {
			return customerDao.deleteCustomer(customer);
		}
		return null;
	}

	public void getAllCustomer() {
		customerDao.getAllCustomer();
	}
}
