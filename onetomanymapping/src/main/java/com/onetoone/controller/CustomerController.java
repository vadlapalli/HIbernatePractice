package com.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.entity.Customer;
import com.onetoone.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public String saveEntity(@RequestBody Customer entity) {
		return service.saveCustomer(entity);
	}
	
	@GetMapping("customers/{id}")
	public void getCustomer(@PathVariable Integer id) {
		 service.getCustomer(id);
		
	}
	
	@DeleteMapping("customers/{id}")
	public String deleteCustomer(@PathVariable Integer id) {
		 service.deleteCust(id);
		return "Deleted SUccessfully";
	}
	
	 @PutMapping("/customers/{id}")
	    public Customer updateCustomerAndOrders(@PathVariable Integer id, @RequestBody Customer updatedCustomer) {
	        return service.updateCustomer(id,updatedCustomer);
	    }
}
