package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
