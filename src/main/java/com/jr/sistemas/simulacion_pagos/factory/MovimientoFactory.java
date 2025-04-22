package com.jr.sistemas.simulacion_pagos.factory;

import com.jr.sistemas.simulacion_pagos.service.Movimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.AperturaCuentaMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.CancelarCuentaMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.CargoMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.DepositoMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.InteresMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.ItfMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.MantenimientoMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.RetiroMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.TransferenciaIngresoMovimiento;
import com.jr.sistemas.simulacion_pagos.service.impl.TransferenciaSalidaMovimiento;

public class MovimientoFactory {
    
    public static Movimiento crear(String codigo){
        return switch(codigo){
            case "001" -> new AperturaCuentaMovimiento();
            case "002" -> new CancelarCuentaMovimiento();
            case "003" -> new DepositoMovimiento();
            case "004" -> new RetiroMovimiento();
            case "005" -> new InteresMovimiento();
            case "006" -> new MantenimientoMovimiento();
            case "007" -> new ItfMovimiento();
            case "008" -> new TransferenciaIngresoMovimiento();
            case "009" -> new TransferenciaSalidaMovimiento();
            case "010" -> new CargoMovimiento();
            default -> throw new IllegalArgumentException("Código de movimiento  no soportado: "+codigo);
        };

    }
}
