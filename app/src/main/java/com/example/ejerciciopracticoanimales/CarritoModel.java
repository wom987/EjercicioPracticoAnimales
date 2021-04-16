package com.example.ejerciciopracticoanimales;

public class CarritoModel {
    String nombreItem;
    double precio;

    public CarritoModel(String nombreItem, double precio) {
        this.nombreItem = nombreItem;
        this.precio = precio;
    }
    public CarritoModel(){};
    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
