package com.jr.sistemas.simulacion_pagos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jr.sistemas.simulacion_pagos.factory.PaymentFactory;
import com.jr.sistemas.simulacion_pagos.model.TypePayment;
import com.jr.sistemas.simulacion_pagos.service.Payment;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pagos")
public class PaymentController {
    
    @GetMapping("/{tipo}")
    public String procesarPago(@PathVariable("tipo") String tipo) {
        try{
            TypePayment tipoPago = TypePayment.valueOf(tipo.toUpperCase());
            Payment payment = PaymentFactory.buldPayment(tipoPago);
            return payment.doPayment();
        }catch(IllegalArgumentException e){
            return "Error: tipo de pago no válido.";
        }
    }
    
    
}
