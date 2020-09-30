package com.martinez.mi_libreria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class VerRegistros extends AppCompatActivity {

    RecyclerView recyclerReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_registros);

        recyclerReg = findViewById(R.id.recyclerReg);

        recyclerReg.setLayoutManager(new LinearLayoutManager(this));
        MiAdaptador adaptador = new MiAdaptador(this, GenerarRegistros.listalibros);
        recyclerReg.setAdapter(adaptador);

    }
}