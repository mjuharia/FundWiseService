package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.Country;



public interface CountryRepository extends JpaRepository<Country, Integer> {

}
