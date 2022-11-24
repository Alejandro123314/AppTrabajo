package com.example.aut2_02proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Datos[] datos = new Datos[]{
                new Datos("Cabaña en la esquina", "Descripción", "12.323€"),
                new Datos("Casa del Molino", "Descripción", "14.678€"),
                new Datos("Los aguilones", "Descripción", "18.592€"),
                new Datos("Casa Roja", "Descripción", "8.397€")};

        ListView listadoMarcas = (ListView) findViewById(R.id.ListAdapater);
        View cabeceraGV = getLayoutInflater().inflate(R.layout.cabezada, null);
        listadoMarcas.addHeaderView(cabeceraGV);
        Adaptador adaptador = new Adaptador(this, datos);

        listadoMarcas.setAdapter(adaptador);

        listadoMarcas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            listadoMarcas.getItemAtPosition(i);
            }
        });
    }
}