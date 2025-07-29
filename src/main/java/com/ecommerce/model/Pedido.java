package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private Integer orden;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Direccion direccionEntrega;
    private String estado;
    @OneToMany
    private List<ItemPedido> itemsPedido;
    @ManyToOne
    private Cadete cadete;
    private String fechaIngreso;
    private String fechaDespacho;
    private String fechaEntrega;
}
