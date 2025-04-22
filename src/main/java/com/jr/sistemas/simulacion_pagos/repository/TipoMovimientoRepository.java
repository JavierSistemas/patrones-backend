package com.jr.sistemas.simulacion_pagos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jr.sistemas.simulacion_pagos.model.TipoMovimiento;

@Repository
public interface TipoMovimientoRepository extends JpaRepository<TipoMovimiento, String> {
    
    // Devuelve todos los movimientos activos
    List<TipoMovimiento> findByEstado(String estado);

    // Buscar por código
    TipoMovimiento findByCodigo(String codigo);

    

}
