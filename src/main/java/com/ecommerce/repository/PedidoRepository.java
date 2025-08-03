package com.ecommerce.repository;

import com.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Override
    Pedido save(Pedido pedido);

    @Override
    List<Pedido> findAll();

    @Override
    Optional<Pedido> findById(Long id);

    Pedido cambiarEstado(Long id, String estado);

    List<Pedido> findByEstado(String estado);

    List<Pedido> findByClienteId(Long clienteId);

    List<Pedido> findByCadeteId(Long cadeteId);
}
