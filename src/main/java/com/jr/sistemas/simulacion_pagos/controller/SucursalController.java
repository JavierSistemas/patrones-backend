package com.jr.sistemas.simulacion_pagos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jr.sistemas.simulacion_pagos.model.Sucursal;
import com.jr.sistemas.simulacion_pagos.service.SucursalService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/sucursal")
public class SucursalController {
    
    @Autowired
    private SucursalService service;

    @GetMapping("/list")
    public ResponseEntity<List<Sucursal>> listarSucursales() {
        List<Sucursal> lista = service.sucursales();
        return ResponseEntity.ok().body(lista);
    }
    
}
