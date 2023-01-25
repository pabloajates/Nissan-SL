package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;

public class ImprimirChasis {

    public void imprimir(Chasis chasis){

        System.out.println("Numero de bastidor: " +chasis.getCodBastidor() +" | " +chasis.getMarca() +" | " +chasis.getModelo());
        System.out.println("Ruedas: " +chasis.getAccesorios().getCod());
        System.out.println("Motor: " +chasis.getAccesorios().getCod());
        System.out.println("CuadroMando: " +chasis.getAccesorios().getCod());
    }
}
