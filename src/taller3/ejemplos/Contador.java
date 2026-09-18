package taller3.ejemplos;

// Ejemplo 1: Atributo static compartido entre instancias[cite: 3]
public class Contador {
    public static int contadorGlobal = 0; // Se comparte entre todos los objetos[cite: 3]

    public Contador() {
        contadorGlobal++; // Incrementa cada vez que se crea un objeto[cite: 3]
    }

    public static void mostrarContador() {
        System.out.println("Contador global: " + contadorGlobal); //[cite: 3]
    }
}
