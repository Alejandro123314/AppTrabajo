package com.example.aut2_02proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

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
                new Datos("Cabaña en la esquina", "Linea Medio 1", "12.323€"),
                new Datos("Casa del Molino", "Linea Medio 2", "14.678€"),
                new Datos("Los aguilones", "Linea Medio 3", "18.592€"),
                new Datos("Casa Roja", "Linea Medio 4", "8.397€")};

        ListView listadoMarcas = (ListView) findViewById(R.id.ListAdapater);
        View cabeceraGV = getLayoutInflater().inflate(R.layout.cabezada, null);
        listadoMarcas.addHeaderView(cabeceraGV);
        Adaptador adaptador = new Adaptador(this, datos);

        listadoMarcas.setAdapter(adaptador);

        listadoMarcas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView marcaSeleccionada = (TextView) findViewById(R.id.tvMensajeMarca1);
                String marca = ((Datos) adapterView.getItemAtPosition(i)).getTexto1();
                marcaSeleccionada.setText(marca);

                TextView descripcionSeleccionada = (TextView) findViewById(R.id.tvMensajeDescripcion);
                String descripcion = ((Datos)adapterView.getItemAtPosition(i)).getTexto2();
                descripcionSeleccionada.setText(descripcion);
            }
        });
    }
}