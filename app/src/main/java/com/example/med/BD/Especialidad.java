package com.example.med.BD;

public class Especialidad {
    private Integer IdEspecialidad;
    private String Nombre_Esp;
    private Integer IdPrestacion;

    public Especialidad(Integer idEspecialidad, String nombre_Esp, Integer idPrestacion) {
        IdEspecialidad = idEspecialidad;
        Nombre_Esp = nombre_Esp;
        IdPrestacion = idPrestacion;
    }

    public Integer getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        IdEspecialidad = idEspecialidad;
    }

    public String getNombre_Esp() {
        return Nombre_Esp;
    }

    public void setNombre_Esp(String nombre_Esp) {
        Nombre_Esp = nombre_Esp;
    }

    public Integer getIdPrestacion() {
        return IdPrestacion;
    }

    public void setIdPrestacion(Integer idPrestacion) {
        IdPrestacion = idPrestacion;
    }
}
