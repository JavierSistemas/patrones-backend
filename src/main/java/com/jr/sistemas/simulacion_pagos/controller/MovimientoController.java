package com.jr.sistemas.simulacion_pagos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jr.sistemas.simulacion_pagos.dto.TipoMovimientoDTO;
import com.jr.sistemas.simulacion_pagos.service.MovimientoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/api/movimiento")
public class MovimientoController {

    private final MovimientoService service;

    public MovimientoController(MovimientoService service)    {
        this.service = service;
    }
    
    @GetMapping("/combo")
    public List<TipoMovimientoDTO> listarMovimiento(){
        return service.obtenerMovimientosActivos();
    }

    @GetMapping("/{codigo}")
    public TipoMovimientoDTO simularMovimiento(@PathVariable String codigo) {
        return service.procesarMovimiento(codigo);
       
    }
    
    
}
