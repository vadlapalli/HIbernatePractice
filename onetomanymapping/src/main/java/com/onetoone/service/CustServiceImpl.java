package com.onetoone.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onetoone.entity.Customer;
import com.onetoone.entity.Orders;
import com.onetoone.repository.CustomerRepo;



@Service
@Transactional
public class CustServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;

	@Override
	public String saveCustomer(Customer customer) {
			if (customer.getOrders() != null) {
		        for (Orders order : customer.getOrders()) {
		            order.setCustomer(customer);
		        }
	    }
	    repo.save(customer);
	    return "Data Saved";
	}

	@Override
	public String getCustomer(Integer id) {
		Optional<Customer> findById = repo.findById(id);
		if(findById.isPresent()) {
			System.out.println(findById.get());
			return "Customer available";
		}else {
			return "Customer not available";
		}
		
	}

	@Override
	public void deleteCust(Integer id) {
		repo.deleteById(id);
	}
	
	@Override
	public Customer updateCustomer(Integer id, Customer updateCustomer) {
		Optional<Customer> optional = repo.findById(id);
		if(optional.isPresent()) {
			Customer customer = optional.get();
			if(updateCustomer.getOrders() != null) {
				for(Orders order:updateCustomer.getOrders()) {
					order.setCustomer(updateCustomer);
				}
			}
			BeanUtils.copyProperties(updateCustomer, customer);
			repo.save(customer);
		}
		return null;
	}


}
