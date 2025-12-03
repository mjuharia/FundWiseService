package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.DrawRequest;

public interface DrawRequestRepository extends JpaRepository<DrawRequest, Integer>{

}
