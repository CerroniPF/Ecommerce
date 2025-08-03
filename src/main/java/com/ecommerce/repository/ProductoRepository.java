package com.ecommerce.repository;

import com.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Producto save(Producto producto);

    @Override
    List<Producto> findAll();

    @Override
    Optional<Producto> findById(Long id);

    List<Producto> findAllByEstado(String estado);
}
