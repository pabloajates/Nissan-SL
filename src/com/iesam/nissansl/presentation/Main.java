package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.CuadroMando;
import com.iesam.nissansl.domain.models.Motor;
import com.iesam.nissansl.domain.models.Ruedas;
import com.iesam.nissansl.domain.usecases.GuardarAccesorioUseCase;
import com.iesam.nissansl.domain.usecases.GuardarChasisUseCase;
import com.iesam.nissansl.domain.usecases.ObtenerChasisUseCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Crear RuedasA
        Ruedas ruedasA = new Ruedas();
        ruedasA.setCodRueda(1);
        ruedasA.setMarca("Michelin");
        ruedasA.setModelo("Alpin 6");
        ruedasA.setDiametro("185");

        GuardarAccesorioUseCase guardarAccesorioUseCase = new GuardarAccesorioUseCase();
        GuardarAccesorioUseCase.execute(ruedasA);

        //Crear RuedasB
        Ruedas ruedasB = new Ruedas();
        ruedasB.setCodRueda(2);
        ruedasB.setMarca("Firestone");
        ruedasB.setModelo("WinterHawk");
        ruedasB.setDiametro("205");

        GuardarAccesorioUseCase.execute(ruedasB);

        //Crear MotorA
        Motor motorA = new Motor();
        motorA.setCodMotor(1);
        motorA.setModelo("X6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120 cv");

        GuardarAccesorioUseCase.execute(motorA);

        //Crear MotorB
        Motor motorB = new Motor();
        motorB.setCodMotor(2);
        motorB.setModelo("X9000");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160 cv");

        GuardarAccesorioUseCase.execute(motorB);

        //Crear CuadroMandosA
        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodCuadro(1);
        cuadroMandoA.setModelo("XT500");

        GuardarAccesorioUseCase.execute(cuadroMandoA);

        //Crear CuadroMandosB
        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoB.setCodCuadro(2);
        cuadroMandoB.setModelo("DK320");

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

        System.out.println(" ----- Stock de accesorios -----");
        System.out.print("Unidades de la rueda A: ");
        ruedasA.setUnidadesRuedas(sc.nextInt());
        System.out.print("Unidades de la rueda B: ");
        ruedasB.setUnidadesRuedas(sc.nextInt());
        System.out.print("Unidades del motor A: ");
        motorA.setUnidadesMotor(sc.nextInt());
        System.out.print("Unidades del motor B: ");
        motorB.setUnidadesMotor(sc.nextInt());
        System.out.print("Unidades del cuadro de mando A: ");
        cuadroMandoA.setUnidadesCuadro(sc.nextInt());
        System.out.print("Unidades del cuadro de mando B: ");
        cuadroMandoB.setUnidadesCuadro(sc.nextInt());

    }
}