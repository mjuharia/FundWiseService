package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.CustomerWireInstruction;

public interface CustomerWireInstructionRepository extends JpaRepository<CustomerWireInstruction, Integer> {

}
