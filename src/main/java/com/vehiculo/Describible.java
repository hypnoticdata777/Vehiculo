package com.vehiculo;

/**
 * Contract that every vehicle in the system must fulfil.
 *
 * <p>Implementing this interface guarantees two things:</p>
 * <ul>
 *   <li>The object can print a formatted description of itself to stdout
 *       via {@link #mostrarInfo()}.</li>
 *   <li>The object can return a concise, single-line text summary via
 *       {@link #describir()}.</li>
 * </ul>
 *
 * <p>This is the OOP <em>abstraction</em> layer: callers work against
 * {@code Describible} and are unaware of the concrete vehicle type at
 * compile time.</p>
 */
public interface Describible {

    /**
     * Prints a human-readable, multi-line summary of this vehicle to
     * standard output.
     */
    void mostrarInfo();

    /**
     * Returns a concise, single-line text description of this vehicle.
     *
     * @return non-null, non-blank string identifying the vehicle and its
     *         key attributes.
     */
    String describir();
}
