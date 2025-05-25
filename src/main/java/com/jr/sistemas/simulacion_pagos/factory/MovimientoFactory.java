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
         switch(codigo){
            case "001":
                return new AperturaCuentaMovimiento();
            case "002":
                return new CancelarCuentaMovimiento();
            case "003":
                return new DepositoMovimiento();
            case "004":
            return  new RetiroMovimiento();
            case "005":
                return  new InteresMovimiento();
            case "006":
                return  new MantenimientoMovimiento();
            case "007":
                return new ItfMovimiento();
            case "008": 
                return new TransferenciaIngresoMovimiento();
            case "009": 
                return new TransferenciaSalidaMovimiento();
            case "010": 
                return new CargoMovimiento();
            default:
              throw new IllegalArgumentException("Código de movimiento  no soportado: "+codigo);
        }

    }
}
