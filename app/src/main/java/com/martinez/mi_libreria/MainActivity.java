package com.martinez.mi_libreria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_CrearR, btn_VerR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_CrearR = findViewById(R.id.btn_CrearR);
        btn_VerR = findViewById(R.id.btn_VerR);

        btn_CrearR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, GenerarRegistros.class);
                startActivity(intento);
            }
        });

        btn_VerR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity.this, verRegistros.class);
                startActivity(intento2);
            }
        });
    }
}