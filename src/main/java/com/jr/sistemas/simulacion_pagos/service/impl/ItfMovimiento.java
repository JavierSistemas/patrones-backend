package com.jr.sistemas.simulacion_pagos.service.impl;

import com.jr.sistemas.simulacion_pagos.dto.TipoMovimientoDTO;
import com.jr.sistemas.simulacion_pagos.model.TipoMovimiento;
import com.jr.sistemas.simulacion_pagos.repository.TipoMovimientoRepository;
import com.jr.sistemas.simulacion_pagos.service.Movimiento;

public class ItfMovimiento implements Movimiento{

    @Override
    public TipoMovimientoDTO ejecutar(TipoMovimientoRepository repository) {
        TipoMovimiento mov = repository.findByCodigo("007");
        return new TipoMovimientoDTO(mov.getCodigo(), mov.getDescripcion());
    }
  
    
}
