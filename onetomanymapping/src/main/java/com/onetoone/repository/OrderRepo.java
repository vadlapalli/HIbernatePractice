package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer>{

}
