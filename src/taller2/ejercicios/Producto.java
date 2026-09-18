package taller2.ejercicios;

// Ejercicio 1: Clase Producto con uso de 'this' en el constructor[cite: 2]
public class Producto {
    private String nombre;
    private double precio;

    // Constructor que diferencia parámetros de atributos con 'this'[cite: 2]
    public Producto(String nombre, double precio) {
        this.nombre = nombre; //[cite: 2]
        this.precio = precio; //[cite: 2]
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + " | Precio: $" + this.precio); //[cite: 2]
    }
}