package com.example.ejerciciopracticoanimales;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoppingCart#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoppingCart extends Fragment {
    private int score;
    public ShoppingCart() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ShoppingCart newInstance(String param1, String param2) {
        ShoppingCart fragment = new ShoppingCart();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }
    //recibir data
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            score = getArguments().getInt("SCORE", 0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getContext(),String.valueOf(score),Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_shopping_cart, container, false);
    }
}