package com.martinez.mi_libreria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolderDatos> {
    ArrayList<String> lista_datos;

    public MiAdaptador(ArrayList<String> lista_datos) {
        this.lista_datos = lista_datos;
    }

    @NonNull
    @Override
    public MiAdaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.activity_ver_registros, null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.ViewHolderDatos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lista_datos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
        }


    }
}
