package com.brunopbrito31.apiprodutos.repositories;

import com.brunopbrito31.apiprodutos.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
