package com.example.tpn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio_1 extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suma);
        this.setTitle("Suma");
        et1 = (EditText) findViewById(R.id.editText_N1);
        et2 = (EditText) findViewById(R.id.editText_N2);
        tv1 = (TextView) findViewById(R.id.txt_suma);
    }


    public void Sumar() {
    }

    public void Sumar(View view)
    {

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int sum = num1 + num2;

        String result;
        result = String.valueOf(sum);
        tv1.setText(result);
    }


}