package com.vehiculo;

/**
 * Abstract base class for all vehicles in the system.
 *
 * <p>Every vehicle has an identifier ({@code id}) and a brand
 * ({@code marca}). Concrete subclasses must implement
 * {@link Describible#mostrarInfo()} and may override
 * {@link #describir()} to provide type-specific output.</p>
 *
 * <p><strong>Inheritance hierarchy:</strong></p>
 * <pre>
 *   Vehiculo (abstract)
 *   ├── Coche
 *   ├── Trailer
 *   ├── Avion
 *   └── Moto
 *       ├── MotoEstandar
 *       └── MotoAutomatica
 * </pre>
 */
public abstract class Vehiculo implements Describible {

    /** Unique identifier for this vehicle. */
    protected String id;

    /** Brand / manufacturer name. */
    protected String marca;

    /**
     * Creates a new vehicle with the given id and brand.
     *
     * @param id    unique vehicle identifier, e.g. {@code "C001"}
     * @param marca brand name, e.g. {@code "Toyota"}
     */
    public Vehiculo(String id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    /** @return the unique identifier of this vehicle. */
    public String getId() { return id; }

    /** @return the brand name of this vehicle. */
    public String getMarca() { return marca; }

    /**
     * {@inheritDoc}
     *
     * <p>Default implementation returns a generic Vehiculo description.
     * Subclasses should override this to include their specific fields.</p>
     */
    @Override
    public String describir() {
        return "Vehiculo [id=" + id + ", marca=" + marca + "]";
    }
}
