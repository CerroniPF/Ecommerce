package com.ecommerce.repository;

import com.ecommerce.model.Cadete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CadeteRepository extends JpaRepository<Cadete, Long> {

    @Override
    List<Cadete> findAll();
}
