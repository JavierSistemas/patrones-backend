package com.jr.sistemas.simulacion_pagos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jr.sistemas.simulacion_pagos.model.Cliente;
import com.jr.sistemas.simulacion_pagos.service.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService service;

    @GetMapping("/list")
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> lista = service.clientes();
        return ResponseEntity.ok().body(lista);
    }
    
    @GetMapping("/detalle-cliente")
    public String detalleCliente(@RequestParam String param) {
        return new String();
    }
    

}
