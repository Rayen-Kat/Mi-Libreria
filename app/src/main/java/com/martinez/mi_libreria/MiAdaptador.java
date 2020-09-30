package com.martinez.mi_libreria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolderDatos> {
    ArrayList<Libros> listalibros;

    public MiAdaptador(VerRegistros verRegistros, ArrayList<Libros> listalibros) {
        this.listalibros = listalibros;
    }

    @NonNull
    @Override
    public MiAdaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.simple_recycler_item,parent,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.ViewHolderDatos holder, int position) {
        holder.txtTitulo.setText(listalibros.get(position).getTitulo());
        holder.txtLeido.setText(listalibros.get(position).getLeido());
        holder.txtAutor.setText(listalibros.get(position).getAutor());
        holder.txtCat.setText(listalibros.get(position).getCategoria());
        holder.txtCali.setText(listalibros.get(position).getCalificacion());

    }

    @Override
    public int getItemCount() {
        return listalibros.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtTitulo, txtLeido, txtAutor, txtCat, txtCali;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtLeido = itemView.findViewById(R.id.txtLeido);
            txtAutor = itemView.findViewById(R.id.txtAutor);
            txtCat = itemView.findViewById(R.id.txtCat);
            txtCali = itemView.findViewById(R.id.txtCali);
        }
    }
}
