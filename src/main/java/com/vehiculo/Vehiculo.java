package com.vehiculo;

public class Vehiculo {
    protected String id;
    protected String marca;

    public Vehiculo(String id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public void mostrarInfo() {
        System.out.println("=== VEHICULO ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
    }

    public String getId() { return id; }
    public String getMarca() { return marca; }
}
