package com.grupocordillera.servicio_pedidos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupocordillera.servicio_pedidos.model.Pedido;
import com.grupocordillera.servicio_pedidos.repository.PedidoRepository;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping("/resumen-ventas")
    public ResponseEntity<List<Pedido>> obtenerVentasConsolidadas() {
        List<Pedido> pedidos = repository.findAll();
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/todos")
    public List<Pedido> obtenerTodos() {
        return repository.findAll();
    }

    @GetMapping("/sucursal/{nombre}")
    public List<Pedido> obtenerPorSucursal(@PathVariable String nombre) {
        return repository.findBySucursalOrigen(nombre);
    }

    @PostMapping("/crear")
    public Pedido crearPedido(@RequestBody Pedido nuevoPedido) {
        return repository.save(nuevoPedido);
    }
}
