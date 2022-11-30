package com.example.aut2_02proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.recyclerview.widget.ListAdapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int tamanio;

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

                switch(i) {

                    case 1:
                        Intent siguiente = new Intent(MainActivity.this,Descripcion.class);
                        startActivity(siguiente);
                        break;
                    case 2:
                        // Lanzas la actividad 2
                        break;
                    case 3:
                        // Lanzas la actividad 3
                        break;
                    case 4:
                        // Lanzas la actividad 4
                        break;
                }

            }
        });
    }
}