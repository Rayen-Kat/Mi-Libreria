package com.martinez.mi_libreria;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class GenerarRegistros extends AppCompatActivity {

    private EditText txtTitulo, txtAutore;
    private Spinner sCat;
    private CheckBox cbLeido;
    private RatingBar ratingBar;
    private Button btnCrear;
    private boolean TituloOk = false;
    private boolean AutorOK = false;
    private String RbSelect;
    static ArrayList<Libros> listalibros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar_registros);

        txtTitulo =findViewById(R.id.txtTitulo);
        sCat = findViewById(R.id.sCat);
        cbLeido = findViewById(R.id.cbLeido);
        ratingBar = findViewById(R.id.ratingBar);
        btnCrear = findViewById(R.id.btnCrear);
        txtAutore = findViewById(R.id.txtAutore);

        ratingBar.setEnabled(false);

        txtTitulo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 2){
                    txtTitulo.setError("Titulo Muy Corto");
                    TituloOk = false;
                }else {
                    TituloOk = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        txtAutore.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() < 2){
                    txtAutore.setError("Autor Muy Corto");
                    AutorOK = false;
                }else {
                    AutorOK = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        cbLeido.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cbLeido.isChecked() == true){
                    ratingBar.setEnabled(true);
                }else{
                    ratingBar.setEnabled(false);
                }
            }
        });



        ArrayAdapter<CharSequence> adaptador =
                ArrayAdapter.createFromResource(GenerarRegistros.this,R.array.categoria_array,
                        android.R.layout.simple_spinner_item);

        sCat.setAdapter(adaptador);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GenerarRegistros.this, "Creado", Toast.LENGTH_LONG).show();
                String Titulo = txtTitulo.getText().toString();
                String Autor = txtAutore.getText().toString();
                String Categoria = sCat.getSelectedItem().toString();
                String Calificacion = Float.toString(ratingBar.getRating());
                String Leido = Boolean.toString(cbLeido.isChecked());

                Libros libro = new Libros(Titulo, Autor, Categoria, Leido, Calificacion);
                listalibros.add(libro);

            }

        });
    }
}

