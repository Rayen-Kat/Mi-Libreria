package com.martinez.mi_libreria;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;


public class GenerarRegistros extends AppCompatActivity {

    private EditText txtTitulo, txtAutore;
    private Spinner sCat;
    private RadioGroup rgGrupo;
    private CheckBox cbSaga;
    private RatingBar ratingBar;
    private Button btnCrear;
    private boolean TituloOk = false;
    private boolean AutorOK = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar_registros);

        txtTitulo =findViewById(R.id.txtTitulo);
        sCat = findViewById(R.id.sCat);
        rgGrupo = findViewById(R.id.rgGrupo);
        cbSaga = findViewById(R.id.cbSaga);
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

        rgGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbSi){
                    ratingBar.setEnabled(true);

                }else{
                    ratingBar.setRating(0);
                    ratingBar.setEnabled(false);
                }
            }
        });

        ArrayAdapter<CharSequence> adaptador =
                ArrayAdapter.createFromResource(GenerarRegistros.this,R.array.categoria_array,
                        android.R.layout.simple_spinner_item);

        sCat.setAdapter(adaptador);
    }
}