package com.iesam.nissansl.domain.models;

public class CuadroMando implements Accesorios {

    private Integer codCuadro;
    private String modelo;


    public Integer getCodCuadro() {
        return codCuadro;
    }

    public void setCodCuadro(Integer codCuadro) {
        this.codCuadro = codCuadro;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String getCod() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }
}
