package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.CustomerLocation;

public interface CustomerLocationRepository extends JpaRepository<CustomerLocation, Integer> {

}
