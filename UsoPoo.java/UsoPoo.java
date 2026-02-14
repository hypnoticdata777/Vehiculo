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
// Clase MotoEstandar
class MotoEstandar extends Moto {
private int velocidades;
public MotoEstandar(String id, String marca, int cilindrada, int velocidades) {
    super(id, marca, cilindrada);
    this.velocidades = velocidades;
}

@Override
public void mostrarInfo() {
    System.out.println("=== MOTO ESTANDAR ===");
    System.out.println("ID: " + id);
    System.out.println("Marca: " + marca);
    System.out.println("Cilindrada: " + cilindrada + " cc");
    System.out.println("Velocidades: " + velocidades);
}
}
// Clase MotoAutomatica
class MotoAutomatica extends Moto {
private String tipoTransmision;
public MotoAutomatica(String id, String marca, int cilindrada, String tipoTransmision) {
    super(id, marca, cilindrada);
    this.tipoTransmision = tipoTransmision;
}

@Override
public void mostrarInfo() {
    System.out.println("=== MOTO AUTOMATICA ===");
    System.out.println("ID: " + id);
    System.out.println("Marca: " + marca);
    System.out.println("Cilindrada: " + cilindrada + " cc");
    System.out.println("Tipo de Transmision: " + tipoTransmision);
}
}
// Clase Avion
class Avion extends Vehiculo {
private int motores;
public Avion(String id, String marca, int motores) {
    super(id, marca);
    this.motores = motores;
}

@Override
public void mostrarInfo() {
    System.out.println("=== AVION ===");
    System.out.println("ID: " + id);
    System.out.println("Marca: " + marca);
    System.out.println("Motores: " + motores);
}
}
// Clase principal
public class UsoPoo {
public static void main(String[] args) {
System.out.println("DEMOSTRACION DE POLIMORFISMO Y HERENCIA\n");

// Crear instancias de cada tipo
    Vehiculo coche = new Coche("C001", "Toyota", 4);
    Vehiculo trailer = new Trailer("T001", "Kenworth", 25.5);
    Vehiculo motoEstandar = new MotoEstandar("ME001", "Honda", 600, 6);
    Vehiculo motoAutomatica = new MotoAutomatica("MA001", "Yamaha", 125, "CVT");
    Vehiculo avion = new Avion("A001", "Boeing", 2);

    // Demostrar polimorfismo
    coche.mostrarInfo();
    System.out.println();

    trailer.mostrarInfo();
    System.out.println();

    motoEstandar.mostrarInfo();
    System.out.println();

    motoAutomatica.mostrarInfo();
    System.out.println();

    avion.mostrarInfo();
    System.out.println();

    System.out.println("*** POLIMORFISMO DEMOSTRADO ***");
    System.out.println("Todas las variables son tipo 'Vehiculo' pero ejecutan");
    System.out.println("el metodo mostrarInfo() de su clase real.");
}
}
