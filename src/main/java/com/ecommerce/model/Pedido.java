package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Integer orden;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "direccion_entrega_id")
    private Direccion direccionEntrega;
    private String estado;
    //Armar enum?
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id")
    private List<ItemPedido> itemsPedido;
    @ManyToOne
    @JoinColumn(name = "cadete_id")
    private Cadete cadete;
    private String fechaIngreso;
    private String fechaDespacho;
    private String fechaEntrega;
}
