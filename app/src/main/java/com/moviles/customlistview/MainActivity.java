package com.moviles.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listaPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] fotoPerfil ={
            R.drawable.persona,
            R.drawable.ic_launcher_foreground,
        };

        String[] nombres={

        };

        String[] telefonos={};



        ListAdapter personas = new ListAdapter(MainActivity.this,nombres,telefonos,fotoPerfil);
        listaPersonas=(ListView) findViewById(R.id.listaUsuarios);
        listaPersonas.setAdapter(personas);
    }
}