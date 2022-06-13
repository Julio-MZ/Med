package com.example.med.BD;

public class Prevision {
    private Integer IdPrevision;
    private String Nombre_Prev;

    public Prevision(Integer idPrevision, String nombre_Prev) {
        IdPrevision = idPrevision;
        Nombre_Prev = nombre_Prev;
    }

    public Integer getIdPrevision() {
        return IdPrevision;
    }

    public void setIdPrevision(Integer idPrevision) {
        IdPrevision = idPrevision;
    }

    public String getNombre_Prev() {
        return Nombre_Prev;
    }

    public void setNombre_Prev(String nombre_Prev) {
        Nombre_Prev = nombre_Prev;
    }
}