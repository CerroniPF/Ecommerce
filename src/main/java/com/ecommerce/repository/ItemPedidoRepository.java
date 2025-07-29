package com.ecommerce.repository;

import com.ecommerce.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
    @Override
    List<ItemPedido> findAll();
}
