package taller3.ejercicios;

// Ejercicio 3: Demostración de acceso incorrecto a atributos no estáticos[cite: 3]
public class ErrorStaticAtributo {
    private String atributoInstancia = "Valor no estático";

    /*
    // INTENTO INCORRECTO:
    public static void mostrarError() {
        // Genera error de compilación: No se puede acceder a 'atributoInstancia' desde un contexto estático[cite: 3]
        System.out.println("Nombre: " + atributoInstancia);
    }
    */

    // CORRECCIÓN: Recibir una instancia del objeto para acceder a su atributo de instancia
    public static void mostrarCorregido(ErrorStaticAtributo objeto) {
        System.out.println("Atributo accedido mediante objeto: " + objeto.atributoInstancia);
    }
}