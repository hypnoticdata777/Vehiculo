package com.vehiculo;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PolimorfismoTest {

    @Test
    void allVehiclesAreDescribible() {
        List<Vehiculo> fleet = List.of(
            new Coche("C001", "Toyota", 4),
            new Trailer("T001", "Kenworth", 25.5),
            new Moto("M001", "Kawasaki", 400),
            new MotoEstandar("ME001", "Honda", 600, 6),
            new MotoAutomatica("MA001", "Yamaha", 125, "CVT"),
            new Avion("A001", "Boeing", 2)
        );

        for (Vehiculo v : fleet) {
            assertInstanceOf(Describible.class, v,
                v.getClass().getSimpleName() + " should implement Describible");
            assertNotNull(v.describir(),
                v.getClass().getSimpleName() + ".describir() should not return null");
            assertFalse(v.describir().isBlank(),
                v.getClass().getSimpleName() + ".describir() should not be blank");
        }
    }

    @Test
    void eachVehicleDescribirContainsItsId() {
        List<Vehiculo> fleet = List.of(
            new Coche("C001", "Toyota", 4),
            new Trailer("T001", "Kenworth", 25.5),
            new Avion("A001", "Boeing", 2)
        );

        for (Vehiculo v : fleet) {
            assertTrue(v.describir().contains(v.getId()),
                "describir() should contain the vehicle id");
        }
    }
}
