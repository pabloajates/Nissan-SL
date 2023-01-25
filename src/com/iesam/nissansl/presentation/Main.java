package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.CuadroMando;
import com.iesam.nissansl.domain.models.Motor;
import com.iesam.nissansl.domain.models.Ruedas;
import com.iesam.nissansl.domain.usecases.GuardarAccesorioUseCase;
import com.iesam.nissansl.domain.usecases.GuardarChasisUseCase;
import com.iesam.nissansl.domain.usecases.ObtenerChasisUseCase;

public class Main {
    public static void main(String[] args) {

        //Crear RuedasA
        Ruedas ruedasA = new Ruedas();
        ruedasA.setCodRueda(1);
        ruedasA.setMarca("Michelin");
        ruedasA.setModelo("Alpin 6");
        ruedasA.setDiametro("185");
        ruedasA.setUnidades("5");

        GuardarAccesorioUseCase guardarAccesorioUseCase = new GuardarAccesorioUseCase();
        GuardarAccesorioUseCase.execute(ruedasA);

        //Crear RuedasB
        Ruedas ruedasB = new Ruedas();
        ruedasB.setCodRueda(2);
        ruedasB.setMarca("Firestone");
        ruedasB.setModelo("WinterHawk");
        ruedasB.setDiametro("205");
        ruedasB.setUnidades("3");

        GuardarAccesorioUseCase.execute(ruedasB);

        //Crear MotorA
        Motor motorA = new Motor();
        motorA.setCodMotor(1);
        motorA.setModelo("X6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120 cv");
        motorA.setUnidades("2");

        GuardarAccesorioUseCase.execute(motorA);

        //Crear MotorB
        Motor motorB = new Motor();
        motorB.setCodMotor(2);
        motorB.setModelo("X9000");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160 cv");
        motorB.setUnidades("2");

        GuardarAccesorioUseCase.execute(motorB);

        //Crear CuadroMandosA
        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodCuadro(1);
        cuadroMandoA.setModelo("XT500");
        cuadroMandoA.setUnidades("4");

        GuardarAccesorioUseCase.execute(cuadroMandoA);

        //Crear CuadroMandosB
        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoB.setCodCuadro(2);
        cuadroMandoB.setModelo("DK320");
        cuadroMandoB.setUnidades("2");

        GuardarAccesorioUseCase.execute(cuadroMandoB);

        //Crear ChasisA
        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodBastidor(1000);
        chasisAAAA.setMarca("Mercedes");
        chasisAAAA.setModelo("M500");


        GuardarChasisUseCase guardarChasisUseCase = new GuardarChasisUseCase();
        guardarChasisUseCase.execute(chasisAAAA);

        //Crear ChasisB
        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodBastidor(1001);
        chasisBBBB.setMarca("Renault");
        chasisBBBB.setModelo("TG12");


        guardarChasisUseCase.execute(chasisBBBB);

        //Crear ChasisC
        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodBastidor(1002);
        chasisCCCC.setMarca("Audi");
        chasisCCCC.setModelo("FK800");


        guardarChasisUseCase.execute(chasisCCCC);

        //Crear ChasisD
        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodBastidor(1003);
        chasisDDDD.setMarca("Golf");
        chasisDDDD.setModelo("30M");


        guardarChasisUseCase.execute(chasisDDDD);

        ObtenerChasisUseCase obtenerChasisUseCase = new ObtenerChasisUseCase();


        ImprimirChasis imprimirChasis = new ImprimirChasis();
        imprimirChasis.imprimir(chasisAAAA, ruedasA, motorB, cuadroMandoA );
        imprimirChasis.imprimir(chasisBBBB, ruedasB, motorB, cuadroMandoB  );
        imprimirChasis.imprimir(chasisCCCC, ruedasA, motorA, cuadroMandoA  );
        imprimirChasis.imprimir(chasisDDDD, ruedasA, motorA, cuadroMandoB  );


    }
}