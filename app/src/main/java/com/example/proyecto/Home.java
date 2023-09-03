package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void control(View view) {
        Intent i = new Intent(this, ControlAcceso.class );
        startActivity(i);
    }

    public void codigos(View view) {
        Intent i = new Intent(this, VerCodigos.class );
        startActivity(i);
    }

    public void historial(View view) {
        Intent i = new Intent(this, VerHistorial.class );
        startActivity(i);
    }

    public void cerrar(View view) {
        finish();
    }
}