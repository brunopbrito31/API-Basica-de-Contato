package com.brunopbrito31.apiprodutos.services;

import com.brunopbrito31.apiprodutos.entities.Contact;
import com.brunopbrito31.apiprodutos.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Long id){
        return contactRepository.findById(id);
    }

    public Contact insertContact(Contact contact){
        contact = contactRepository.save(contact);
        return contact;
    }

    public void deleteContact(Long id){
        contactRepository.deleteById(id);
    }

    //Colocar um metodo de atualizacao
}
