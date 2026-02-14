// Clase base Vehiculo
class Vehiculo {
    protected String id;
    protected String marca;
    
    public Vehiculo(String id, String marca) {
        this.id = id;
        this.marca = marca;
    }
    
    public void mostrarInfo() {
        System.out.println("=== VEHICULO ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
    }
}
// Clase Coche
class Coche extends Vehiculo {
private int puertas;
public Coche(String id, String marca, int puertas) {
    super(id, marca);
    this.puertas = puertas;
}

@Override
public void mostrarInfo() {
    System.out.println("=== COCHE ===");
    System.out.println("ID: " + id);
    System.out.println("Marca: " + marca);
    System.out.println("Puertas: " + puertas);
}
}
// Clase Trailer
class Trailer extends Vehiculo {
private double capacidadToneladas;
public Trailer(String id, String marca, double capacidadToneladas) {
    super(id, marca);
    this.capacidadToneladas = capacidadToneladas;
}

@Override
public void mostrarInfo() {
    System.out.println("=== TRAILER ===");
    System.out.println("ID: " + id);
    System.out.println("Marca: " + marca);
    System.out.println("Capacidad: " + capacidadToneladas + " toneladas");
}

}
// Clase Moto
class Moto extends Vehiculo {
protected int cilindrada;

public Moto(String id, String marca, int cilindrada) {
    super(id, marca);
    this.cilindrada = cilindrada;
}

@Override
public void mostrarInfo() {
    System.out.println("=== MOTO ===");
    System.out.println("ID: " + id);
    System.out.println("Marca: " + marca);
    System.out.println("Cilindrada: " + cilindrada + " cc");
}
}
