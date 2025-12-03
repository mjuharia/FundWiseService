package com.moso.fundwiseservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;


import com.moso.fundwiseservice.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
