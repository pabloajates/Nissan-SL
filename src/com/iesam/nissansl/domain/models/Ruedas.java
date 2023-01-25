package com.iesam.nissansl.domain.models;

public class Ruedas implements Accesorios {

    private Integer codRueda;
    private String marca;
    private String modelo;
    private String diametro;

    private String unidades;

    public void setCodRueda(Integer codRueda) {
        this.codRueda = codRueda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public Integer getCod() {
        return codRueda;
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
