package com.example.med.Conexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.med.Utilidades.Utilidades;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_REGION);
        db.execSQL(Utilidades.CREAR_TABLA_COMUNA);
        db.execSQL(Utilidades.CREAR_TABLA_PREVISION);
        db.execSQL(Utilidades.CREAR_TABLA_PACIENTE);
        db.execSQL(Utilidades.CREAR_TABLA_PRESTACION);
        db.execSQL(Utilidades.CREAR_TABLA_ESPECIALIDAD);
        db.execSQL(Utilidades.CREAR_TABLA_MEDICO);
        db.execSQL(Utilidades.CREAR_TABLA_EXAMEN);
        db.execSQL(Utilidades.CREAR_TABLA_RESULTADOEXAM);
        db.execSQL(Utilidades.CREAR_TABLA_CONSULTA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS Region;");
        db.execSQL("DROP TABLE IF EXISTS Comuna;");
        db.execSQL("DROP TABLE IF EXISTS Prevision;");
        db.execSQL("DROP TABLE IF EXISTS Paciente;");
        db.execSQL("DROP TABLE IF EXISTS Prestacion;");
        db.execSQL("DROP TABLE IF EXISTS Especialidad;");
        db.execSQL("DROP TABLE IF EXISTS Medico;");
        db.execSQL("DROP TABLE IF EXISTS Examen;");
        db.execSQL("DROP TABLE IF EXISTS ResultadoExam;");
        db.execSQL("DROP TABLE IF EXISTS Consulta;");
        onCreate(db);
    }
}
