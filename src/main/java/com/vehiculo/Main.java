package com.vehiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("DEMOSTRACION DE POLIMORFISMO Y HERENCIA\n");

        Vehiculo coche        = new Coche("C001", "Toyota", 4);
        Vehiculo trailer      = new Trailer("T001", "Kenworth", 25.5);
        Vehiculo motoEstandar = new MotoEstandar("ME001", "Honda", 600, 6);
        Vehiculo motoAuto     = new MotoAutomatica("MA001", "Yamaha", 125, "CVT");
        Vehiculo avion        = new Avion("A001", "Boeing", 2);

        coche.mostrarInfo();        System.out.println();
        trailer.mostrarInfo();      System.out.println();
        motoEstandar.mostrarInfo(); System.out.println();
        motoAuto.mostrarInfo();     System.out.println();
        avion.mostrarInfo();        System.out.println();

        System.out.println("*** POLIMORFISMO DEMOSTRADO ***");
        System.out.println("Todas las variables son tipo 'Vehiculo' pero ejecutan");
        System.out.println("el metodo mostrarInfo() de su clase real.");
    }
}
