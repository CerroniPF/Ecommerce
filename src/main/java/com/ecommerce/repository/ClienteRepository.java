package com.ecommerce.repository;

import com.ecommerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Override
    List<Cliente> findAll();

    @Override
    Cliente save(Cliente cliente);

    @Override
    void deleteById(Long id);

    @Override
    Optional<Cliente> findById(Long id);




}
