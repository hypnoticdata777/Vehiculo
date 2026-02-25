package com.vehiculo;

public class Avion extends Vehiculo {
    private int motores;

    public Avion(String id, String marca, int motores) {
        super(id, marca);
        this.motores = motores;
    }

    public int getMotores() { return motores; }

    @Override
    public String describir() {
        return "Avion [id=" + id + ", marca=" + marca + ", motores=" + motores + "]";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== AVION ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Motores: " + motores);
    }
}
