package com.example.med.BD;

public class Region {
    private Integer IdRegion;
    private String Nombre_Reg;

    public Region(Integer idRegion, String nombre_Reg) {
        IdRegion = idRegion;
        Nombre_Reg = nombre_Reg;
    }

    public Integer getIdRegion() {
        return IdRegion;
    }

    public void setIdRegion(Integer idRegion) {
        IdRegion = idRegion;
    }

    public String getNombre_Reg() {
        return Nombre_Reg;
    }

    public void setNombre_Reg(String nombre_Reg) {
        Nombre_Reg = nombre_Reg;
    }
}
