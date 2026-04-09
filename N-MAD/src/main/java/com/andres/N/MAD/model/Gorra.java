package com.andres.N.MAD.model;

public class Gorra {

    private String nombre;
    private String marca;
    private double precio;
    private String imagen;

    public Gorra(String nombre, String marca, double precio, String imagen) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }
}