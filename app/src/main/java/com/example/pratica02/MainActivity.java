package com.example.pratica02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Ciclo de Vida", getClassName() + ".onCreate() chamado.");
        setContentView(R.layout.activity_main);
    }
    public void clickButtonRelatorio(View v){
        EditText edtNome = (EditText) findViewById(R.id.Nome);
        EditText edtIdade = (EditText) findViewById(R.id.Idade);
        EditText edtPeso = (EditText) findViewById(R.id.Peso);
        EditText edtAltura = (EditText) findViewById(R.id.Altura);
        Double valor1 = Double.parseDouble(edtPeso.getText().toString());
        Double valor2 = Double.parseDouble(edtAltura.getText().toString());
        Double aux = ((valor1)/(valor2*valor2));
        String result = String.format("%.1f",aux);

        Intent it = new Intent(getBaseContext(),Tela2.class);

        if(aux < 18.5){
            it.putExtra("clas", "Abaixo do Peso");
        }
        else if(aux >= 18.5 && aux <= 24.9){
            it.putExtra("clas", "Saudável");
        }
        else if(aux >= 25 && aux <= 29.9){
            it.putExtra("clas", "Sobrepeso");
        }
        else if(aux >= 30 && aux <= 34.9){
            it.putExtra("clas", "Obesidade Grau I");
        }
        else if(aux >= 35 && aux <= 39.9){
            it.putExtra("clas", "Obesidade Grau II (severa)");
        }
        else if(aux >= 40){
            it.putExtra("clas", "Obesidade Grau III (mórbida)");
        }

        it.putExtra("nome", edtNome.getText().toString());
        it.putExtra("idade",edtIdade.getText().toString());
        it.putExtra("peso",edtPeso.getText().toString());
        it.putExtra("altura",edtAltura.getText().toString());
        it.putExtra("imc",result);


        startActivity(it);
    }
    private String getClassName(){
        String s = getClass().getName();
        return s;
    }
    protected void onStart(){
        super.onStart();
        Log.i("Ciclo de Vida", getClassName() + ".onStart() chamado.");
    }
    protected void onRestart(){
        super.onRestart();
        Log.i("Ciclo de Vida", getClassName() + ".onRestart() chamado.");
    }
    protected void onResume(){
        super.onResume();
        Log.i("Ciclo de Vida", getClassName() + ".onResume() chamado.");
    }
    protected void onPause(){
        super.onPause();
        Log.i("Ciclo de Vida", getClassName() + ".onPause() chamado.");
    }
    protected void onStop(){
        super.onStop();
        Log.i("Ciclo de Vida", getClassName() + ".onStop() chamado.");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo de Vida", getClassName() + ".onDestroy() chamado.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }
}