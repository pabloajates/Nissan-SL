package com.iesam.nissansl.domain.models;

public class Chasis {

    private Integer codBastidor;
    private String modelo;

    private String marca;

    private Accesorios accesorios;

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    public Integer getCodBastidor() {
        return codBastidor;
    }

    public void setCodBastidor(Integer codBastidor) {
        this.codBastidor = codBastidor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}





