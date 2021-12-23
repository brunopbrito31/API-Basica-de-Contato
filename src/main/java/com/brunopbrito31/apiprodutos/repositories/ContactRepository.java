package com.brunopbrito31.apiprodutos.repositories;

import com.brunopbrito31.apiprodutos.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
