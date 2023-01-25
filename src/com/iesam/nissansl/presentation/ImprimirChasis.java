package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.CuadroMando;
import com.iesam.nissansl.domain.models.Motor;
import com.iesam.nissansl.domain.models.Ruedas;

public class ImprimirChasis {

    public void imprimir(Chasis chasis, Ruedas ruedas, Motor motor, CuadroMando cuadroMando){

        System.out.println("Numero de bastidor: " +chasis.getCodBastidor() +" | " +chasis.getMarca() +" | " +chasis.getModelo());
        System.out.println("Ruedas: " +ruedas.getCod() +" | " +ruedas.getMarca() +" | " +ruedas.getModelo() +" | " +ruedas.getDiametro());
        System.out.println("Motor: " +motor.getCodMotor() +" | " +motor.getModelo() +" | " +motor.getCilindrada() + " | " +motor.getCaballos());
        System.out.println("Cuadro de mando: " +cuadroMando.getCod() +" | " +cuadroMando.getModelo() );
        System.out.println("--------------------------------------------------------------------------------------------------------------- \n");
    }

}
