package com.example.aut2_02proyectoandroid;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Descripcion extends AppCompatActivity {

    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descripcion);
        Bundle extras = getIntent().getExtras();
        String valor;
        resultado = (EditText) findViewById(R.id.editTextTextPersonName);
        valor = extras.getString("hola");
        resultado.setText(valor);
    }


}
