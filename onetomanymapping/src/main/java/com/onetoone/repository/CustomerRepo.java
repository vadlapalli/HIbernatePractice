package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
