package com.jr.sistemas.simulacion_pagos.factory;

import com.jr.sistemas.simulacion_pagos.model.TypePayment;
import com.jr.sistemas.simulacion_pagos.service.Payment;
import com.jr.sistemas.simulacion_pagos.service.impl.GooglePayment;
import com.jr.sistemas.simulacion_pagos.service.impl.PaypalPayment;

public class PaymentFactory {
    
    public static Payment buldPayment(TypePayment type){
        switch (type) {
            case PAYPAL:
                return new PaypalPayment();
            case GOOGLE:
                return new GooglePayment();
        
            default:
                throw new IllegalArgumentException("Tipo de pago no soportado: "+ type);
        }
    }
}
