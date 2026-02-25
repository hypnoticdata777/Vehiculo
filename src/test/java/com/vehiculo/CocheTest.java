package com.vehiculo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CocheTest {

    @Test
    void constructorSetsFields() {
        Coche c = new Coche("C001", "Toyota", 4);
        assertEquals("C001", c.getId());
        assertEquals("Toyota", c.getMarca());
        assertEquals(4, c.getPuertas());
    }

    @Test
    void cocheIsDescribible() {
        Describible d = new Coche("C002", "Ford", 2);
        assertNotNull(d.describir());
        assertTrue(d.describir().contains("Ford"));
    }

    @Test
    void cocheIsInstanceOfVehiculo() {
        Coche c = new Coche("C003", "BMW", 4);
        assertInstanceOf(Vehiculo.class, c);
    }
}
