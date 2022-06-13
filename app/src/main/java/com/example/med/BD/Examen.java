package com.example.med.BD;

import java.time.format.DateTimeFormatter;

public class Examen {
    private Integer IdExamen;
    private DateTimeFormatter Fecha_Exam;
    private String Rut_Pac;
    private String Rut_Med;

    public Examen(Integer idExamen, DateTimeFormatter fecha_Exam, String rut_Pac, String rut_Med) {
        IdExamen = idExamen;
        Fecha_Exam = fecha_Exam;
        Rut_Pac = rut_Pac;
        Rut_Med = rut_Med;
    }

    public Integer getIdExamen() {
        return IdExamen;
    }

    public void setIdExamen(Integer idExamen) {
        IdExamen = idExamen;
    }

    public DateTimeFormatter getFecha_Exam() {
        return Fecha_Exam;
    }

    public void setFecha_Exam(DateTimeFormatter fecha_Exam) {
        Fecha_Exam = fecha_Exam;
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
