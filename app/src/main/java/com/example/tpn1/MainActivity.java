package com.example.tpn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo del boton ejercicio 1, Suma.

    public void Ejer_1 (View view)
    {
        Intent ejer_1 = new Intent( this, Ejercicio_1.class);
        startActivity(ejer_1 );
    }
    //Metodo del boton ejercicio 2, Calculadora.

    public void Ejer_2 (View view)
    {
        Intent ejer_2 = new Intent( this, Calculadora.class);
        startActivity(ejer_2 );
    }
}