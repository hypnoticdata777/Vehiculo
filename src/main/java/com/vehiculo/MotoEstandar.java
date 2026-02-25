package com.vehiculo;

public class MotoEstandar extends Moto {
    private int velocidades;

    public MotoEstandar(String id, String marca, int cilindrada, int velocidades) {
        super(id, marca, cilindrada);
        this.velocidades = velocidades;
    }

    public int getVelocidades() { return velocidades; }

    @Override
    public void mostrarInfo() {
        System.out.println("=== MOTO ESTANDAR ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Velocidades: " + velocidades);
    }
}
