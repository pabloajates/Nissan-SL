package com.iesam.nissansl.domain.models;

public class CuadroMando implements Accesorios {

    private Integer codCuadro;
    private String modelo;

    private Integer unidadesCuadro;


    public void setCodCuadro(Integer codCuadro) {
        this.codCuadro = codCuadro;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUnidadesCuadro(Integer unidadesCuadro) {
        this.unidadesCuadro = unidadesCuadro;
    }

    @Override
    public Integer getCod() {
        return codCuadro;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public Integer getUnidades() {
        return unidadesCuadro;
    }


}
