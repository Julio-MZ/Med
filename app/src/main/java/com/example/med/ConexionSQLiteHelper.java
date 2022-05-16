package com.example.med;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {
    final String CREAR_TABLA_PACIENTE="CREATE TABLE Paciente (Rut_Pac VARCHAR(13) PRIMARY KEY NOT NULL, " +
            "Nombre_Pac VARCHAR(50), Apellido_Pac VARCHAR(50), Genero_Pac ENUM('H','M'), FechNac_Pac DATE, " +
            "Correo_Pac VARCHAR(50), Telefono_Pac VARCHAR(15), Direccion_Pac VARCHAR(80), " +
            "Contrasena_Pac VARCHAR(20), IDComuna INTEGER NOT NULL"

    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
