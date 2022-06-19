package com.example.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.med.Conexion.ConexionSQLiteHelper;

public class Inicio extends AppCompatActivity {
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ConexionSQLiteHelper con = new ConexionSQLiteHelper(this, "BD_Med", null, 1);

        button2 = (Button) findViewById(R.id.button2);
    }

    public void button2(View view) {
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}