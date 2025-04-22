package com.jr.sistemas.simulacion_pagos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jr.sistemas.simulacion_pagos.model.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, String> {
    List<Sucursal> findAll();    
}
