package taller2.ejercicios;

// Ejercicio 2: Sobrecarga de constructores usando 'this()'[cite: 2]
public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto que invoca al constructor de dos parámetros[cite: 2]
    public Estudiante() {
        this("Estudiante Anónimo", 18); //[cite: 2]
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; //[cite: 2]
        this.edad = edad; //[cite: 2]
    }

    public void mostrarDetalles() {
        System.out.println("Estudiante: " + this.nombre + " | Edad: " + this.edad + " años"); //[cite: 2]
    }
}