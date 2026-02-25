package com.vehiculo;

/**
 * Abstract base class for all vehicles.
 * Subclasses must implement {@link Describible#mostrarInfo()} and
 * {@link Describible#describir()} to provide type-specific output.
 */
public abstract class Vehiculo implements Describible {
    protected String id;
    protected String marca;

    public Vehiculo(String id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public String getId() { return id; }
    public String getMarca() { return marca; }

    @Override
    public String describir() {
        return "Vehiculo [id=" + id + ", marca=" + marca + "]";
    }
}
