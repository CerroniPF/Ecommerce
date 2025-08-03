package com.ecommerce.service;

import com.ecommerce.model.Producto;
import com.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

     @Autowired
     private ProductoRepository productoRepository;

     public Producto save(Producto producto){
         return productoRepository.save(new Producto());
     }

    public List<Producto> findAll() {
            return productoRepository.findAll();
    }

    public Optional<Producto> findById(Long id){
        return productoRepository.findById(id);
    }

    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }

    public List<Producto> findAllProductsByEstado(String estado) {
        return productoRepository.findAllByEstado(estado);
    }
}
