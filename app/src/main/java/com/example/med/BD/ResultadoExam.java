package com.example.med.BD;

public class ResultadoExam {
    private Integer IdResultado;
    private String Detalle;
    private Integer IdExamen;

    public ResultadoExam(Integer idResultado, String detalle, Integer idExamen) {
        IdResultado = idResultado;
        Detalle = detalle;
        IdExamen = idExamen;
    }

    public Integer getIdResultado() {
        return IdResultado;
    }

    public void setIdResultado(Integer idResultado) {
        IdResultado = idResultado;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public Integer getIdExamen() {
        return IdExamen;
    }

    public void setIdExamen(Integer idExamen) {
        IdExamen = idExamen;
    }
}
