package com.jr.sistemas.simulacion_pagos.model;

public enum TipoMovimientoEnum {
    APERTURA_CUENTA("001"),
    CANCELAR_CUENTA("002"),
    DEPOSITO("003"),
    RETIRO("004"),
    INTERES("005"),
    MANTENIMIENTO("006"),
    ITF("007"),
    TRANSFERENCIA_INGRESO("008"),
    TRANSFERENCIA_SALIDA("009"),
    CARGO_MOVIMIENTO("010");



    private final String codigo;

    TipoMovimientoEnum(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

}
