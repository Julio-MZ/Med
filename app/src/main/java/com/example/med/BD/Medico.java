package com.example.med.BD;

public class Medico {
    private String Rut_Med;
    private String Nombre_Med;
    private String Apellido_Med;
    private Integer IdEspecialidad;

    public Medico(String rut_Med, String nombre_Med, String apellido_Med, Integer idEspecialidad) {
        Rut_Med = rut_Med;
        Nombre_Med = nombre_Med;
        Apellido_Med = apellido_Med;
        IdEspecialidad = idEspecialidad;
    }

    public String getRut_Med() {
        return Rut_Med;
    }

    public void setRut_Med(String rut_Med) {
        Rut_Med = rut_Med;
    }

    public String getNombre_Med() {
        return Nombre_Med;
    }

    public void setNombre_Med(String nombre_Med) {
        Nombre_Med = nombre_Med;
    }

    public String getApellido_Med() {
        return Apellido_Med;
    }

    public void setApellido_Med(String apellido_Med) {
        Apellido_Med = apellido_Med;
    }

    public Integer getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        IdEspecialidad = idEspecialidad;
    }
}
