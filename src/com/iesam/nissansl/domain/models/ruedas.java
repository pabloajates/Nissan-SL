package com.iesam.nissansl.domain.models;

public class ruedas {

    private Integer codRueda;
    private String marca;
    private String modelo;

    private String diametro;

    public String getModelo() {
        return modelo;
    }

    public Integer getCodRueda() {
        return codRueda;
    }

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


}
