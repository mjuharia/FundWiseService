package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
