package com.jr.sistemas.simulacion_pagos.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.jr.sistemas.simulacion_pagos.dto.TipoMovimientoDTO;
import com.jr.sistemas.simulacion_pagos.factory.MovimientoFactory;
import com.jr.sistemas.simulacion_pagos.repository.TipoMovimientoRepository;

@Service
public class MovimientoService {
    
    private final TipoMovimientoRepository repository;

    public MovimientoService(TipoMovimientoRepository repository){
        this.repository = repository;
    }

    public List<TipoMovimientoDTO> obtenerMovimientosActivos(){
        return repository.findByEstado("ACTIVO")
                    .stream()
                    .map(m -> new TipoMovimientoDTO(m.getCodigo(),m.getDescripcion()))
                    .toList();
    }

    public TipoMovimientoDTO procesarMovimiento(String codigo){
        Movimiento movimiento = MovimientoFactory.crear(codigo);
        return movimiento.ejecutar(repository);
    }
}
