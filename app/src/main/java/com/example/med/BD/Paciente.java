package com.example.med.BD;

import java.util.Date;

public class Paciente {
    private String Rut_Pac;
    private String Nombre_Pac;
    private String Apellido_Pac;
    private String Genero_Pac;
    private Date FechNac_Pac;
    private String Correo_Pac;
    private String Telefono_Pac;
    private String Direccion_Pac;
    private String Contrasena_Pac;
    private Integer IdComuna;
    private Integer IdPrevision;

    public Paciente(String rut_Pac, String nombre_Pac, String apellido_Pac, String genero_Pac,
                    Date fechNac_Pac, String correo_Pac, String telefono_Pac, String direccion_Pac,
                    String contrasena_Pac, Integer idComuna, Integer idPrevision) {
        Rut_Pac = rut_Pac;
        Nombre_Pac = nombre_Pac;
        Apellido_Pac = apellido_Pac;
        Genero_Pac = genero_Pac;
        FechNac_Pac = fechNac_Pac;
        Correo_Pac = correo_Pac;
        Telefono_Pac = telefono_Pac;
        Direccion_Pac = direccion_Pac;
        Contrasena_Pac = contrasena_Pac;
        IdComuna = idComuna;
        IdPrevision = idPrevision;
    }

    public String getRut_Pac() {
        return Rut_Pac;
    }

    public void setRut_Pac(String rut_Pac) {
        Rut_Pac = rut_Pac;
    }

    public String getNombre_Pac() {
        return Nombre_Pac;
    }

    public void setNombre_Pac(String nombre_Pac) {
        Nombre_Pac = nombre_Pac;
    }

    public String getApellido_Pac() {
        return Apellido_Pac;
    }

    public void setApellido_Pac(String apellido_Pac) {
        Apellido_Pac = apellido_Pac;
    }

    public String getGenero_Pac() {
        return Genero_Pac;
    }

    public void setGenero_Pac(String genero_Pac) {
        Genero_Pac = genero_Pac;
    }

    public Date getFechNac_Pac() {
        return FechNac_Pac;
    }

    public void setFechNac_Pac(Date fechNac_Pac) {
        FechNac_Pac = fechNac_Pac;
    }

    public String getCorreo_Pac() {
        return Correo_Pac;
    }

    public void setCorreo_Pac(String correo_Pac) {
        Correo_Pac = correo_Pac;
    }

    public String getTelefono_Pac() {
        return Telefono_Pac;
    }

    public void setTelefono_Pac(String telefono_Pac) {
        Telefono_Pac = telefono_Pac;
    }

    public String getDireccion_Pac() {
        return Direccion_Pac;
    }

    public void setDireccion_Pac(String direccion_Pac) {
        Direccion_Pac = direccion_Pac;
    }

    public String getContrasena_Pac() {
        return Contrasena_Pac;
    }

    public void setContrasena_Pac(String contrasena_Pac) {
        Contrasena_Pac = contrasena_Pac;
    }

    public Integer getIdComuna() {
        return IdComuna;
    }

    public void setIdComuna(Integer idComuna) {
        IdComuna = idComuna;
    }

    public Integer getIdPrevision() {
        return IdPrevision;
    }

    public void setIdPrevision(Integer idPrevision) {
        IdPrevision = idPrevision;
    }
}
