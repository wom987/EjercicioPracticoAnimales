package com.example.ejerciciopracticoanimales;

public class AlimentosModelo {

    private int portada;
    private String titulo;
    private String historia;
    private double precio;

    public AlimentosModelo(int portada, String titulo, String historia, double precio) {
        this.portada = portada;
        this.titulo = titulo;
        this.historia = historia;
        this.precio = precio;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
