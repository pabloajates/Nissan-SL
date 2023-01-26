package com.iesam.nissansl.domain.models;

public class Motor implements Accesorios {

    private Integer codMotor;
    private String modelo;
    private String cilindrada;
    private String caballos;

    private Integer unidadesMotor;


    @Override
    public Integer getCod() {
        return codMotor;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public Integer getUnidades() {
        return unidadesMotor;
    }


    public Integer getCodMotor() {
        return codMotor;
    }

    public void setCodMotor(Integer codMotor) {
        this.codMotor = codMotor;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }

    public void setUnidadesMotor(Integer unidadesMotor) { this.unidadesMotor = unidadesMotor;}

}
