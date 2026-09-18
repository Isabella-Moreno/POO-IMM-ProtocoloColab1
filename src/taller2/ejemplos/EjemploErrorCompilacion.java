package taller2.ejemplos;

// Ejemplo 3: Demostración de uso incorrecto de 'this'[cite: 2]
public class EjemploErrorCompilacion {
    private String nombre;

    public static void mostrarNombreStatic() {
        // ERROR DE COMPILACIÓN: No se puede usar 'this' en un contexto estático[cite: 2].
        // System.out.println(this.nombre);
    }
}