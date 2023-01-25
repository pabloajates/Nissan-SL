package com.iesam.nissansl.domain.models;

public class CuadroMando implements Accesorios {

    private Integer codCuadro;
    private String modelo;

    private String unidades;


    public void setCodCuadro(Integer codCuadro) {
        this.codCuadro = codCuadro;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
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
    public String getUnidades() {
        return unidades;
    }


}
