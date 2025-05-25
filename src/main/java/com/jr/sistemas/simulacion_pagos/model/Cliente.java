package com.jr.sistemas.simulacion_pagos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @Column(name = "CHR_CLIECODIGO")
    private String codigo;

    @Column(name = "VCH_CLIEPATERNO")
    private String paterno;

    @Column(name = "VCH_CLIEMATERNO")
    private String materno;

    @Column(name = "VCH_CLIENOMBRE")
    private String nombre;

    @Column(name = "CHR_CLIEDNI")
    private String dni;

    @Column(name = "VCH_CLIECIUDAD")
    private String ciudad;

    @Column(name = "VCH_CLIEDIRECCION")
    private String direccion;

    @Column(name = "VCH_CLIETELEFONO")
    private String telefono;

    @Column(name = "VCH_CLIEEMAIL")
    private String email;
    
}
