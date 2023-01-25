package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.CuadroMando;
import com.iesam.nissansl.domain.models.Motor;
import com.iesam.nissansl.domain.models.Ruedas;

public class Main {
    public static void main(String[] args) {

        //Crear RuedasA
        Ruedas ruedasA = new Ruedas();
        ruedasA.setCodRueda(1);
        ruedasA.setMarca("Michelin");
        ruedasA.setModelo("Alpin 6");
        ruedasA.setDiametro("185");
        ruedasA.setUnidades("5");

        //Crear RuedasB
        Ruedas ruedasB = new Ruedas();
        ruedasB.setCodRueda(2);
        ruedasB.setMarca("Firestone");
        ruedasB.setModelo("WinterHawk");
        ruedasB.setDiametro("205");
        ruedasB.setUnidades("3");

        //Crear MotorA
        Motor motorA = new Motor();
        motorA.setCodMotor(1);
        motorA.setModelo("X6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120 cv");
        motorA.setUnidades("2");

        //Crear MotorB
        Motor motorB = new Motor();
        motorB.setCodMotor(2);
        motorB.setModelo("X9000");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160 cv");
        motorB.setUnidades("2");

        //Crear CuadroMandosA
        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodCuadro(1);
        cuadroMandoA.setModelo("XT500");
        cuadroMandoA.setUnidades("4");

        //Crear CuadroMandosB
        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoB.setCodCuadro(2);
        cuadroMandoB.setModelo("DK320");
        cuadroMandoB.setUnidades("2");

        //Crear ChasisA
        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodBastidor(1000);
        chasisAAAA.setMarca("Mercedes");
        chasisAAAA.setModelo("M500");
        chasisAAAA.setAccesorios(motorB);
        chasisAAAA.setAccesorios(ruedasA);
        chasisAAAA.setAccesorios(cuadroMandoA);

        //Crear ChasisB
        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodBastidor(1001);
        chasisBBBB.setMarca("Renault");
        chasisBBBB.setModelo("TG12");
        chasisBBBB.setAccesorios(motorB);
        chasisBBBB.setAccesorios(ruedasB);
        chasisBBBB.setAccesorios(cuadroMandoB);

        //Crear ChasisC
        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodBastidor(1002);
        chasisCCCC.setMarca("Audi");
        chasisCCCC.setModelo("FK800");
        chasisCCCC.setAccesorios(motorA);
        chasisCCCC.setAccesorios(ruedasA);
        chasisCCCC.setAccesorios(cuadroMandoA);

        //Crear ChasisD
        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodBastidor(230);
        chasisDDDD.setMarca("Golf");
        chasisDDDD.setModelo("30M");
        chasisDDDD.setAccesorios(motorA);
        chasisDDDD.setAccesorios(ruedasA);
        chasisDDDD.setAccesorios(cuadroMandoB);

    }
}