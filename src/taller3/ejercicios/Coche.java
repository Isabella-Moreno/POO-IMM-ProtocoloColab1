package taller3.ejercicios;

// Ejercicio 1: Contador de instancias con atributo y método static[cite: 3]
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0; // Atributo estático compartido[cite: 3]

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Incrementar contador al crear un objeto[cite: 3]
    }

    public static void mostrarCantidadCoches() {
        System.out.println("Total de coches creados: " + contadorCoches); //[cite: 3]
    }

    public void mostrarInformacion() {
        System.out.println("Coche: " + this.marca + " " + this.modelo);
    }
}