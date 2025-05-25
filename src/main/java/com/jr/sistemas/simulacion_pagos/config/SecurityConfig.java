package com.jr.sistemas.simulacion_pagos.config;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
/**
 * Clase que permite configurar la seguridad
 * @author Jreyes
 * @since 1.0
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends  WebSecurityConfigurerAdapter{

    @Override
    protected  void configure(HttpSecurity http) throws Exception{
        http
            .csrf().disable() // Desactiva el CSRF para pruebas con Postman
            .authorizeRequests()
                .antMatchers("/api/clientes/list","/api/sucursal/list","/api/movimiento/**", "/api/movimiento/combo").permitAll() // rutas publicas
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    public UrlBasedCorsConfigurationSource CorsConfigurationSource(){
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(Arrays.asList("http://localhost:3000","http://localhost:5173")); // React
        config.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE"));
        config.setAllowedHeaders(Arrays.asList("*"));
        config.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
    
}
