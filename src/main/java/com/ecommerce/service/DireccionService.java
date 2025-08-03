package com.ecommerce.service;

import com.ecommerce.model.Direccion;
import com.ecommerce.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public List<Direccion> findAll() {
        return direccionRepository.findAll();
    }

    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    public Direccion findById(Long id) {
        return direccionRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id) {
        direccionRepository.deleteById(id);
    }

}
