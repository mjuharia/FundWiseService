package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.FundingSource;

public interface FundingSourceRepository extends JpaRepository<FundingSource, Integer> {

}
