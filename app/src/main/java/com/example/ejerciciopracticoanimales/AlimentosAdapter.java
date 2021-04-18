package com.example.ejerciciopracticoanimales;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AlimentosAdapter extends RecyclerView.Adapter<AlimentosAdapter.ViewHolder> implements View.OnClickListener
{


    public ArrayList<AlimentosModelo> listaAlimentos;
    private View.OnClickListener listener;
    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public double artPrecio;
        public String articulo;
        private TextView titulo, historia, precio;
        ImageView fotoPortada;
        Button btnAgregar;

        private Context context;
        public ViewHolder(View itemView, ViewGroup parent) {
            super(itemView);
            ComprasDB objDb = new ComprasDB(itemView.getContext());
             ArrayList<CarritoModel> carritoModel = new ArrayList<CarritoModel>();
            fotoPortada = itemView.findViewById(R.id.imvAlimentos);
            titulo = itemView.findViewById(R.id.txvTitulo);
            historia = itemView.findViewById(R.id.txvHistoria);
            precio= itemView.findViewById(R.id.txvPrecio);
            View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
            context = parent.getContext();
            itemView.findViewById(R.id.btnComprar).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    objDb.agregar(titulo.toString(),Double.parseDouble(precio.toString()));

                    Toast.makeText(parent.getContext(), "Articulo agregado al carrito",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public AlimentosAdapter(ArrayList<AlimentosModelo>listaAlimentos){

        this.listaAlimentos=listaAlimentos;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_alimentos,parent,false);

        ViewHolder viewHolder= new ViewHolder(view,parent);

        view.setOnClickListener(this);
        return viewHolder;
    }
    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.fotoPortada.setImageResource(listaAlimentos.get(position).getPortada());
        holder.titulo.setText(listaAlimentos.get(position).getTitulo());
        holder.historia.setText(listaAlimentos.get(position).getHistoria());
        holder.precio.setText("Precio: $"+ listaAlimentos.get(position).getPrecio());
        holder.articulo = listaAlimentos.get(position).getTitulo();
        holder.artPrecio = listaAlimentos.get(position).getPrecio();

    }


    @Override
    public int getItemCount() {
        return listaAlimentos.size();
    }


}