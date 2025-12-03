package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moso.fundwiseservice.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}
