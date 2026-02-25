package com.vehiculo;

public class Moto extends Vehiculo {
    protected int cilindrada;

    public Moto(String id, String marca, int cilindrada) {
        super(id, marca);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }

    @Override
    public String describir() {
        return "Moto [id=" + id + ", marca=" + marca + ", cilindrada=" + cilindrada + "cc]";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== MOTO ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
