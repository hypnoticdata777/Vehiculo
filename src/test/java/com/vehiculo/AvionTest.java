package com.vehiculo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AvionTest {

    @Test
    void constructorSetsFields() {
        Avion a = new Avion("A001", "Boeing", 2);
        assertEquals("A001", a.getId());
        assertEquals("Boeing", a.getMarca());
        assertEquals(2, a.getMotores());
    }

    @Test
    void describcionContainsMotores() {
        Avion a = new Avion("A002", "Airbus", 4);
        assertTrue(a.describir().contains("4"));
        assertTrue(a.describir().contains("Airbus"));
    }

    @Test
    void avionIsDescribible() {
        Describible d = new Avion("A003", "Embraer", 2);
        assertNotNull(d.describir());
    }
}
