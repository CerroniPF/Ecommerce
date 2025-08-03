package com.ecommerce.repository;

import com.ecommerce.model.Cadete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CadeteRepository extends JpaRepository<Cadete, Long> {

    @Override
    Cadete save(Cadete cadete);

    @Override
    Optional<Cadete> findById(Long id);

    @Override
    List<Cadete> findAll();

    @Override
    void deleteById(Long id);
}
