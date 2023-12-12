package com.onetoone.service;

import com.onetoone.entity.Customer;


public interface CustomerService {
	
	String saveCustomer(Customer customer);
	
	String getCustomer(Integer id);
	
	void deleteCust(Integer id);
	
	Customer updateCustomer(Integer id,Customer updateCustomer);
	
	

}
