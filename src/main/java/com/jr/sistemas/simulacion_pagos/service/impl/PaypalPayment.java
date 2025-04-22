package com.jr.sistemas.simulacion_pagos.service.impl;

import com.jr.sistemas.simulacion_pagos.service.Payment;

public class PaypalPayment  implements Payment{

    @Override
    public String doPayment() {
        
        return "Pago realizado con Paypal";
    }
    
}
