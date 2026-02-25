package com.vehiculo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void constructorSetsFields() {
        Moto m = new Moto("M001", "Kawasaki", 400);
        assertEquals("M001", m.getId());
        assertEquals("Kawasaki", m.getMarca());
        assertEquals(400, m.getCilindrada());
    }

    @Test
    void motoEstandarInheritsFromMoto() {
        MotoEstandar me = new MotoEstandar("ME001", "Honda", 600, 6);
        assertInstanceOf(Moto.class, me);
        assertEquals(6, me.getVelocidades());
        assertEquals(600, me.getCilindrada());
    }

    @Test
    void motoAutomaticaInheritsFromMoto() {
        MotoAutomatica ma = new MotoAutomatica("MA001", "Yamaha", 125, "CVT");
        assertInstanceOf(Moto.class, ma);
        assertEquals("CVT", ma.getTipoTransmision());
    }

    @Test
    void describcionContainsCilindrada() {
        Moto m = new Moto("M002", "Suzuki", 750);
        assertTrue(m.describir().contains("750"));
    }
}
