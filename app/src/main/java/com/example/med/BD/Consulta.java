package com.example.med.BD;

import java.time.format.DateTimeFormatter;

public class Consulta {
    private Integer IdConsulta;
    private DateTimeFormatter Fecha_Con;
    private String Rut_Pac;
    private String Rut_Med;

    public Consulta(Integer idConsulta, DateTimeFormatter fecha_Con, String rut_Pac, String rut_Med) {
        IdConsulta = idConsulta;
        Fecha_Con = fecha_Con;
        Rut_Pac = rut_Pac;
        Rut_Med = rut_Med;
    }

    public Integer getIdConsulta() {
        return IdConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        IdConsulta = idConsulta;
    }

    public DateTimeFormatter getFecha_Con() {
        return Fecha_Con;
    }

    public void setFecha_Con(DateTimeFormatter fecha_Con) {
        Fecha_Con = fecha_Con;
    }

    public String getRut_Pac() {
        return Rut_Pac;
    }

    public void setRut_Pac(String rut_Pac) {
        Rut_Pac = rut_Pac;
    }

    public String getRut_Med() {
        return Rut_Med;
    }

    public void setRut_Med(String rut_Med) {
        Rut_Med = rut_Med;
    }
}