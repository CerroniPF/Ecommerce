package com.ecommerce.repository;

import com.ecommerce.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    @Override
    List<Direccion> findAll();
}
