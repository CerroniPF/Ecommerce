package com.ecommerce.service;

import com.ecommerce.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoService pedidoService;

    public Pedido save(Pedido pedido) {
        return pedidoService.save(pedido);
    }

    public Pedido findById(Long id) {
        return pedidoService.findById(id);
    }

    public List<Pedido> findAll() {
        return pedidoService.findAll();
    }

    public Pedido cambiarEstado(Long id, String estado) {
        return pedidoService.cambiarEstado(id, estado);
    }
    public List<Pedido> findByEstado(String estado) {
        return pedidoService.findByEstado(estado);
    }
    public List<Pedido> findByClienteId(Long clienteId) {
        return pedidoService.findByClienteId(clienteId);
    }

}
