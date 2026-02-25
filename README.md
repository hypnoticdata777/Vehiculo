# Vehiculo — Java OOP Demo

An educational Java project that demonstrates the three pillars of
Object-Oriented Programming — **abstraction**, **inheritance**, and
**polymorphism** — through a vehicle classification hierarchy.

## Class Hierarchy

```
Vehiculo  (abstract)  implements Describible
├── Coche
├── Trailer
├── Avion
└── Moto
    ├── MotoEstandar
    └── MotoAutomatica
```

The `Describible` interface defines the contract every vehicle must
honour: `mostrarInfo()` for formatted console output and `describir()`
for a concise single-line summary.

## Requirements

| Tool  | Version |
|-------|---------|
| Java  | 11+     |
| Maven | 3.6+    |

## Quick Start

```bash
# Compile
mvn compile

# Run all tests
mvn test

# Run the demo application
mvn exec:java -Dexec.mainClass=com.vehiculo.Main

# Build a runnable fat-jar
mvn package
java -jar target/vehiculo-1.0.0.jar
```

## Project Structure

```
src/
├── main/java/com/vehiculo/
│   ├── Describible.java      # Interface contract
│   ├── Vehiculo.java         # Abstract base class
│   ├── Coche.java            # Car (4-door, etc.)
│   ├── Trailer.java          # Cargo truck
│   ├── Moto.java             # Base motorcycle
│   ├── MotoEstandar.java     # Manual-transmission motorcycle
│   ├── MotoAutomatica.java   # Automatic-transmission motorcycle
│   ├── Avion.java            # Airplane
│   └── Main.java             # Demo entry point
└── test/java/com/vehiculo/
    ├── CocheTest.java
    ├── TrailerTest.java
    ├── MotoTest.java
    ├── AvionTest.java
    └── PolimorfismoTest.java  # Cross-cutting polymorphism tests
```

## OOP Concepts Demonstrated

| Concept       | Where                                                       |
|---------------|-------------------------------------------------------------|
| Abstraction   | `Describible` interface + `Vehiculo` abstract class         |
| Inheritance   | All subclasses extend `Vehiculo`; `MotoEstandar`/`MotoAutomatica` extend `Moto` |
| Polymorphism  | `Vehiculo` references hold concrete objects; `mostrarInfo()` dispatches at runtime |
| Encapsulation | Private fields exposed only through public getters          |
