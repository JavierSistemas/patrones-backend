package com.jr.sistemas.simulacion_pagos.service;

import com.jr.sistemas.simulacion_pagos.dto.TipoMovimientoDTO;
import com.jr.sistemas.simulacion_pagos.repository.TipoMovimientoRepository;

public interface Movimiento {
    TipoMovimientoDTO ejecutar(TipoMovimientoRepository repository);
}
