package com.ecommerce.controller;

import com.ecommerce.model.Producto;
import com.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAllProducts() {
        List<Producto> productos = productoService.findAll();
        if(productos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Producto>> getAllProductos() {
        List<Producto> productos = productoService.findAll();
        if (productos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/{estado}")
    public ResponseEntity<List<Producto>> getProductsByEstado(@RequestParam String estado) {
        List<Producto> productos = productoService.findAllProductsByEstado(estado);
        if (productos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Producto> addProduct(@RequestBody Producto producto) {
        Producto savedProducto = productoService.save(producto);
        return new ResponseEntity<>(savedProducto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> getProductById(@PathVariable Long id) {
        return productoService.findById(id)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> updateProduct(@PathVariable Long id, @RequestBody Producto producto) {
        if (!productoService.findById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        producto.setId(id);
        Producto updatedProducto = productoService.save(producto);
        return new ResponseEntity<>(updatedProducto, HttpStatus.OK);
    }

    @PutMapping("/{id}/estado")
    public ResponseEntity<Producto> updateProductEstado(@PathVariable Long id, @RequestParam String estado) {
        if (productoService.findById(id).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Producto producto = productoService.findById(id).get();
        producto.setEstado(estado);
        Producto updatedProducto = productoService.save(producto);
        return new ResponseEntity<>(updatedProducto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        if (!productoService.findById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        productoService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
