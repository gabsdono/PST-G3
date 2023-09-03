package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ControlAcceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_acceso);
    }
    public void abrirP (View view) {}
    public void cerrarP (View view) {}
    public void volver1 (View view) {
        finish();
    }

}