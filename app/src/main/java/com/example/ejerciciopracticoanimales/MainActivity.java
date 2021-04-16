package com.example.ejerciciopracticoanimales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvAlimentos;
    private AlimentosAdapter adapterAlimentos;
    private Button  btnCarrito;
    private Button btnAgregar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCarrito = (Button) findViewById(R.id.btnCarrito) ;
        btnCarrito.setBackgroundColor(Color.parseColor("#36b336"));
        btnCarrito.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"adfasdfasf",Toast.LENGTH_LONG).show());
        rcvAlimentos = findViewById(R.id.rcvLista);
        rcvAlimentos.setLayoutManager(new LinearLayoutManager(this));

        adapterAlimentos = new AlimentosAdapter(obtenerAnimales());
        rcvAlimentos.setAdapter(adapterAlimentos);


    }


    public List<AlimentosModelo> obtenerAnimales() {
        List<AlimentosModelo> animales = new ArrayList<>();
        animales.add(new AlimentosModelo(R.drawable.imagen2, "Nupec", "Elaboramos nuestra fórmula HIGH TECH que promueve el 90% de aprovechamiento de nutrientes.",10.99));
        animales.add(new AlimentosModelo(R.drawable.imagen3, "Dog Chow", " Con el consumo regular de DOG CHOW y  tu perro podrá vivir mejor hasta por 1.8 años más de vida saludable. ",20.99));
        animales.add(new AlimentosModelo(R.drawable.imagen4, "Dogui", "Es un alimento balanceado y nutricionalmente equilibrado para perros que cuenta con una exquisita combinación de ingredientes.",1.59));
        animales.add(new AlimentosModelo(R.drawable.imagen5, "Beneful", "Sabemos que tu perro es tu mejor amigo, por eso estamos a favor de alimentos 100% completos y balanceados.",200.66));
        return animales;


    }


}