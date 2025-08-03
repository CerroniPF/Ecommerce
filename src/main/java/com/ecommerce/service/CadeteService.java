package com.ecommerce.service;

import com.ecommerce.model.Cadete;
import com.ecommerce.repository.CadeteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadeteService {

    @Autowired
    private CadeteRepository cadeteRepository;


    public Cadete save(Cadete cadete) {
        return cadeteRepository.save(cadete);
    }

    public Cadete findById(Long id) {
        return cadeteRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        cadeteRepository.deleteById(id);
    }

}
