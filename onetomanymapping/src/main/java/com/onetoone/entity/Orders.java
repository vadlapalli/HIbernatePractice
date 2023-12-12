package com.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Orders {

	@Id
    private Integer id;

    private String description;

    private String status;

    @ManyToOne // Add a reference to Customer
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @Override
    public String toString() {
        // Avoid unintentional recursion here
        return "Orders{id=" + id + ", description='" + description + "', status='" + status + "'}";
    }

}

