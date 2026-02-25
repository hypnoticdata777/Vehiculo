package com.vehiculo;

public class Trailer extends Vehiculo {
    private double capacidadToneladas;

    public Trailer(String id, String marca, double capacidadToneladas) {
        super(id, marca);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() { return capacidadToneladas; }

    @Override
    public String describir() {
        return "Trailer [id=" + id + ", marca=" + marca + ", capacidad=" + capacidadToneladas + "t]";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== TRAILER ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidadToneladas + " toneladas");
    }
}
