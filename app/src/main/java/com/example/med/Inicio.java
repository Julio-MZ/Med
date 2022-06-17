package com.example.med;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ConexionSQLiteHelper con = new ConexionSQLiteHelper(this, "BD_Med", null, 1);
    }
}