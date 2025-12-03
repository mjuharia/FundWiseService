package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.InvoiceMethod;

public interface InvoiceMethodRepository extends JpaRepository<InvoiceMethod, Integer> {

}
