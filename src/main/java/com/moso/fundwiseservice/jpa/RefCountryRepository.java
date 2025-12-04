package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.RefCountry;



public interface RefCountryRepository extends JpaRepository<RefCountry, Integer> {

}
