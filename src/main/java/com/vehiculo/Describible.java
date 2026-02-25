package com.vehiculo;

/**
 * Contract that every vehicle must be able to describe itself.
 */
public interface Describible {
    /** Print a human-readable summary of this vehicle to stdout. */
    void mostrarInfo();

    /** Return a single-line text description of this vehicle. */
    String describir();
}
