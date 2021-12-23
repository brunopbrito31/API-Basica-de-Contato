package com.brunopbrito31.apiprodutos.services;

import com.brunopbrito31.apiprodutos.entities.Informative;
import com.brunopbrito31.apiprodutos.repositories.InformativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformativeService {

    @Autowired
    private InformativeRepository informativeRepository;

    public List<Informative> getAllInformatives() {
        return informativeRepository.findAll();
    }

    public Optional<Informative> getInformativeById(Long id){
        return informativeRepository.findById(id);
    }

    public Informative insertInformative(Informative informative){
        informative = informativeRepository.save(informative);
        return informative;
    }

    public void deleteInformative(Long id){
        informativeRepository.deleteById(id);
    }
}
