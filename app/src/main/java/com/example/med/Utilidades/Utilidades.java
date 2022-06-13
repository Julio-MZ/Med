package com.example.med.Utilidades;

public class Utilidades {
    public static final String TABLA_REGION="Region";
    public static final String CAMPO_IDREGION="IdRegion";
    public static final String CAMPO_NOMBRE_REG="Nombre_Reg";
    public static final String CREAR_TABLA_REGION="CREATE TABLE " + TABLA_REGION + "(" +
            CAMPO_IDREGION + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_NOMBRE_REG + " VARCHAR(50));";

    public static final String TABLA_COMUNA="Comuna";
    public static final String CAMPO_IDCOMUNA="IdComuna";
    public static final String CAMPO_NOMBRE_COM="Nombre_Com";
    public static final String CREAR_TABLA_COMUNA="CREATE TABLE " + TABLA_COMUNA + "(" +
            CAMPO_IDCOMUNA + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_NOMBRE_COM + " VARCHAR(50), " +
            CAMPO_IDREGION + " INT, " +
            "FOREIGN KEY(IdRegion) REFERENCES Region(IdRegion));";

    public static final String TABLA_PREVISION="Prevision";
    public static final String CAMPO_IDPREVISION="IdPrevision";
    public static final String CAMPO_NOMBRE_PREV="Nombre_Prev";
    public static final String CREAR_TABLA_PREVISION="CREATE TABLE " + TABLA_PREVISION + "(" +
            CAMPO_IDPREVISION + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_NOMBRE_PREV + " VARCHAR(50));";

    public static final String TABLA_PACIENTE="Paciente";
    public static final String CAMPO_RUT_PAC="Rut_Pac";
    public static final String CAMPO_NOMBRE_PAC="Nombre_Pac";
    public static final String CAMPO_APELLIDO_PAC="Apellido_Pac";
    public static final String CAMPO_GENERO_PAC="Genero_Pac";
    public static final String CAMPO_FECHNAC_PAC="FechNac_Pac";
    public static final String CAMPO_CORREO_PAC="Correo_Pac";
    public static final String CAMPO_TELEFONO_PAC="Telefono_Pac";
    public static final String CAMPO_DIRECCION_PAC="Direccion_Pac";
    public static final String CAMPO_CONTRASENA_PAC="Contrasena_Pac";
    public static final String CREAR_TABLA_PACIENTE="CREATE TABLE " + TABLA_PACIENTE + "(" +
            CAMPO_RUT_PAC + " VARCHAR(13) PRIMARY KEY NOT NULL, " +
            CAMPO_NOMBRE_PAC + " VARCHAR(50), " +
            CAMPO_APELLIDO_PAC + " VARCHAR(50), " +
            CAMPO_GENERO_PAC + " ENUM('Masculino','Femenino'), " +
            CAMPO_FECHNAC_PAC + " DATE, " +
            CAMPO_CORREO_PAC + " VARCHAR(50), " +
            CAMPO_TELEFONO_PAC + " VARCHAR(15), " +
            CAMPO_DIRECCION_PAC + " VARCHAR(80), " +
            CAMPO_CONTRASENA_PAC + " VARCHAR(20), " +
            CAMPO_IDCOMUNA + " INT, " +
            CAMPO_IDPREVISION + " INT, " +
            "FOREIGN KEY(IdComuna) REFERENCES Comuna(IdComuna), " +
            "FOREIGN KEY(IdPrevision) REFERENCES Prevision(IdPrevision));";

    public static final String TABLA_PRESTACION="Prestacion";
    public static final String CAMPO_IDPRESTACION="IdPrestacion";
    public static final String CAMPO_NOMBRE_PRES="Nombre_Pres";
    public static final String CREAR_TABLA_PRESTACION="CREATE TABLE " + TABLA_PRESTACION + "(" +
            CAMPO_IDPRESTACION + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_NOMBRE_PRES + " VARCHAR(50));";

    public static final String TABLA_ESPECIALIDAD="Especialidad";
    public static final String CAMPO_IDESPECIALIDAD="IdEspecialidad";
    public static final String CAMPO_NOMBRE_ESP="Nombre_Esp";
    public static final String CREAR_TABLA_ESPECIALIDAD="CREATE TABLE " + TABLA_ESPECIALIDAD + "(" +
            CAMPO_IDESPECIALIDAD + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_NOMBRE_ESP + " VARCHAR(50), " +
            CAMPO_IDPRESTACION + " INT, " +
            "FOREIGN KEY(IdPrestacion) REFERENCES Prestacion(IdPrestacion));";

    public static final String TABLA_MEDICO="Medico";
    public static final String CAMPO_RUT_MED="Rut_Med";
    public static final String CAMPO_NOMBRE_MED="Nombre_Med";
    public static final String CAMPO_APELLIDO_MED="Apellido_Med";
    public static final String CREAR_TABLA_MEDICO="CREATE TABLE " + TABLA_MEDICO + "(" +
            CAMPO_RUT_MED + " VARCHAR(13) PRIMARY KEY NOT NULL, " +
            CAMPO_NOMBRE_MED + " VARCHAR(50), " +
            CAMPO_APELLIDO_MED + " VARCHAR(50), " +
            CAMPO_IDESPECIALIDAD + " INT, " +
            "FOREIGN KEY(IdEspecialidad) REFERENCES Especialidad(IdEspecialidad));";

    public static final String TABLA_EXAMEN="Examen";
    public static final String CAMPO_IDEXAMEN="IdExamen";
    public static final String CAMPO_FECHA_EXAM="Fecha_Exam";
    public static final String CREAR_TABLA_EXAMEN="CREATE TABLE " + TABLA_EXAMEN + "(" +
            CAMPO_IDEXAMEN + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_FECHA_EXAM + " DATETIME, " +
            CAMPO_RUT_PAC + " VARCHAR(13), " +
            CAMPO_RUT_MED + " VARCHAR(13), " +
            "FOREIGN KEY(Rut_Pac) REFERENCES Paciente(Rut_Pac), " +
            "FOREIGN KEY(Rut_Med) REFERENCES Medico(Rut_Med));";

    public static final String TABLA_RESULTADOEXAM="ResultadoExam";
    public static final String CAMPO_IDRESULTADO="IdResultado";
    public static final String CAMPO_DETALLE="Detalle";
    public static final String CREAR_TABLA_RESULTADOEXAM="CREATE TABLE " + TABLA_RESULTADOEXAM + "(" +
            CAMPO_IDRESULTADO + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_DETALLE + " VARCHAR(350), " + CAMPO_IDEXAMEN + " INT, " +
            "FOREIGN KEY(IdExamen) REFERENCES Examen(IdExamen));";

    public static final String TABLA_CONSULTA="Consulta";
    public static final String CAMPO_IDCONSULTA="IdConsulta";
    public static final String CAMPO_FECHA_CON="Fecha_Con";
    public static final String CREAR_TABLA_CONSULTA="CREATE TABLE " + TABLA_CONSULTA + "(" +
            CAMPO_IDCONSULTA + " INT AUTO_INCREMENT PRIMARY KEY NOT NULL, " +
            CAMPO_FECHA_CON + " DATETIME, " +
            CAMPO_RUT_PAC + " VARCHAR(13), " +
            CAMPO_RUT_MED + " VARCHAR(13), " +
            "FOREIGN KEY(Rut_Pac) REFERENCES Paciente(Rut_Pac), " +
            "FOREIGN KEY(Rut_Med) REFERENCES Medico(Rut_Med));";
}