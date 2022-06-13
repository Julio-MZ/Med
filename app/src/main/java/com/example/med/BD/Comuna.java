package com.example.med.BD;

public class Comuna {
    private Integer IdComuna;
    private String Nombre_Com;
    private Integer IdRegion;

    public Comuna(Integer idComuna, String nombre_Com, Integer idRegion) {
        IdComuna = idComuna;
        Nombre_Com = nombre_Com;
        IdRegion = idRegion;
    }

    public Integer getIdComuna() {
        return IdComuna;
    }

    public void setIdComuna(Integer idComuna) {
        IdComuna = idComuna;
    }

    public String getNombre_Com() {
        return Nombre_Com;
    }

    public void setNombre_Com(String nombre_Com) {
        Nombre_Com = nombre_Com;
    }

    public Integer getIdRegion() {
        return IdRegion;
    }

    public void setIdRegion(Integer idRegion) {
        IdRegion = idRegion;
    }
}
