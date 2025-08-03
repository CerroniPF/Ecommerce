package com.ecommerce.repository;

import com.ecommerce.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
    @Override
    List<ItemPedido> findAll();

    @Override
    ItemPedido save(ItemPedido itemPedido);

    @Override
    Optional<ItemPedido> findById(Long id);

    @Override
    void deleteById(Long id);


}
