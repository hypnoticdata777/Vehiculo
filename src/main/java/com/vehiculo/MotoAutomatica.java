package com.vehiculo;

public class MotoAutomatica extends Moto {
    private String tipoTransmision;

    public MotoAutomatica(String id, String marca, int cilindrada, String tipoTransmision) {
        super(id, marca, cilindrada);
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoTransmision() { return tipoTransmision; }

    @Override
    public String describir() {
        return "MotoAutomatica [id=" + id + ", marca=" + marca
                + ", cilindrada=" + cilindrada + "cc, transmision=" + tipoTransmision + "]";
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== MOTO AUTOMATICA ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tipo de Transmision: " + tipoTransmision);
    }
}
