package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "item_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private Integer orden;
    private Integer cantidad;
    @OneToMany
    private List<Producto> productos;
}
