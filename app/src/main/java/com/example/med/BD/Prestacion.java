package com.example.med.BD;

public class Prestacion {
    private Integer IdPrestacion;
    private String Nombre_Pres;

    public Prestacion(Integer idPrestacion, String nombre_Pres) {
        IdPrestacion = idPrestacion;
        Nombre_Pres = nombre_Pres;
    }

    public Integer getIdPrestacion() {
        return IdPrestacion;
    }

    public void setIdPrestacion(Integer idPrestacion) {
        IdPrestacion = idPrestacion;
    }

    public String getNombre_Pres() {
        return Nombre_Pres;
    }

    public void setNombre_Pres(String nombre_Pres) {
        Nombre_Pres = nombre_Pres;
    }
}
