package taller3.ejercicios;

// Ejercicio 2: Clase de utilidades con métodos estáticos[cite: 3]
public class Matematicas {

    public static double sumar(double a, double b) {
        return a + b; //[cite: 3]
    }

    public static double restar(double a, double b) {
        return a - b; //[cite: 3]
    }

    public static double multiplicar(double a, double b) {
        return a * b; //[cite: 3]
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b; //[cite: 3]
    }
}