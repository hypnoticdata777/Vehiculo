package com.vehiculo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrailerTest {

    @Test
    void constructorSetsFields() {
        Trailer t = new Trailer("T001", "Kenworth", 25.5);
        assertEquals("T001", t.getId());
        assertEquals("Kenworth", t.getMarca());
        assertEquals(25.5, t.getCapacidadToneladas());
    }

    @Test
    void describcionContainsMarca() {
        Trailer t = new Trailer("T002", "Volvo", 30.0);
        assertTrue(t.describir().contains("Volvo"));
    }

    @Test
    void trailerIsInstanceOfVehiculo() {
        assertInstanceOf(Vehiculo.class, new Trailer("T003", "MAN", 20.0));
    }
}
