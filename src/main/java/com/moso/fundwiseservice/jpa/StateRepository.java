package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
