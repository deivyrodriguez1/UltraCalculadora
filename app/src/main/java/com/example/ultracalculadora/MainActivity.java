package com.example.ultracalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //1. Crear los objetos que se relacionaran con los botones de la layout

    MaterialButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton0,botonC,botonAC,botonP,botonI,botonR,botonS,botonD,botonMul,botonPI,botonPD;
    TextView expresion, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expresion = findViewById(R.id.expresion);

        //2. Relacionar el objeto con el elemento cuyo id sea boton
        boton1 = findViewById(R.id.boton_1);
        boton2 = findViewById(R.id.boton_2);
        boton3 = findViewById(R.id.boton_3);
        boton4 = findViewById(R.id.boton_4);
        boton5 = findViewById(R.id.boton_5);
        boton6 = findViewById(R.id.boton_6);
        boton7 = findViewById(R.id.boton_7);
        boton8 = findViewById(R.id.boton_8);
        boton9 = findViewById(R.id.boton_9);
        boton0 = findViewById(R.id.boton_0);
        botonC = findViewById(R.id.boton_C);
        botonAC = findViewById(R.id.boton_0);
        botonP = findViewById(R.id.boton_punto);
        botonI = findViewById(R.id.boton_igual);
        botonR = findViewById(R.id.boton_restar);
        botonS = findViewById(R.id.boton_sumar);
        botonD = findViewById(R.id.boton_dividir);
        botonMul = findViewById(R.id.boton_multiplicar);
        botonPI = findViewById(R.id.boton_parentesis_i);
        botonPD = findViewById(R.id.boton_parentesis_d);

        //Convertir los botones en un listener
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        boton0.setOnClickListener(this);
        botonC.setOnClickListener(this);
        botonAC.setOnClickListener(this);
        botonP.setOnClickListener(this);
        botonI.setOnClickListener(this);
        botonR.setOnClickListener(this);
        botonS.setOnClickListener(this);
        botonD.setOnClickListener(this);
        botonMul.setOnClickListener(this);
        botonPI.setOnClickListener(this);
        botonPD.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //1, Crear un objeto que represente el boton al cual se le a hecho click

        MaterialButton boton =(MaterialButton) view;

        String texto;
        texto = boton.getText().toString();
        this.expresion.setText(texto);
    }
}