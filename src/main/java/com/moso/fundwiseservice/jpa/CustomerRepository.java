package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
