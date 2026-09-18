package taller2.ejercicios;

// Ejercicio 3: Demostración y corrección de error con 'this' en contexto estático[cite: 2]
public class ErrorThisStatic {
    private String atributoPrueba = "Dato de Instancia";

    /*
    // INTENTO INCORRECTO:
    public static void metodoIncorrecto() {
        // Error de compilación: 'non-static variable this cannot be referenced from a static context'
        System.out.println(this.atributoPrueba);
    }
    */

    // CORRECCIÓN: Un método estático no referencia 'this', debe recibir los datos por argumento
    public static void metodoCorregido(String texto) {
        System.out.println("Texto recibido en método estático corregido: " + texto);
    }
}