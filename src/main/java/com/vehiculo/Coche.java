package com.vehiculo;

public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String id, String marca, int puertas) {
        super(id, marca);
        this.puertas = puertas;
    }

    public int getPuertas() { return puertas; }

    @Override
    public void mostrarInfo() {
        System.out.println("=== COCHE ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Puertas: " + puertas);
    }
}
