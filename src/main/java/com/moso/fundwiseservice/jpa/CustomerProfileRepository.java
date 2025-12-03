package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.CustomerProfile;

public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Integer> {

}
