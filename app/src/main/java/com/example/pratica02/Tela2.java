package com.example.pratica02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent it = getIntent();

        TextView Nome2 = (TextView) findViewById(R.id.Nome2);
        Nome2.setText(it.getStringExtra("nome"));
        TextView Idade2 = (TextView) findViewById(R.id.Idade2);
        Idade2.setText(it.getStringExtra("idade") + " anos");
        TextView Peso2 = (TextView) findViewById(R.id.Peso2);
        Peso2.setText(it.getStringExtra("peso") + " kg");
        TextView Altura2 = (TextView) findViewById(R.id.Altura2);
        Altura2.setText(it.getStringExtra("altura") + " m");
        TextView imc = (TextView) findViewById(R.id.IMC);
        imc.setText(it.getStringExtra("imc") + " kg/m²");
        TextView clas = (TextView) findViewById(R.id.Clas);
        clas.setText(it.getStringExtra("clas"));
    }
    public void buttonNovoCalculo(View v){
        finish();
    }
}