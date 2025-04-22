package com.jr.sistemas.simulacion_pagos.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jr.sistemas.simulacion_pagos.model.Sucursal;
import com.jr.sistemas.simulacion_pagos.repository.SucursalRepository;
import com.jr.sistemas.simulacion_pagos.service.SucursalService;

@Service
public class SucursalServiceImpl  implements SucursalService{

    @Autowired
    private SucursalRepository repository;

    @Override
    public List<Sucursal> sucursales() {
        return repository.findAll();    
    }
    
}
