package taller2.ejercicios;

public class MainTaller2 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA EJERCICIO 1: Producto ===");
        Producto producto1 = new Producto("Computador Portátil", 2500.00);
        producto1.mostrarProducto();

        System.out.println("\n=== PRUEBA EJERCICIO 2: Estudiante ===");
        Estudiante estudianteDefault = new Estudiante();
        Estudiante estudiantePersonalizado = new Estudiante("Isabella", 20);
        estudianteDefault.mostrarDetalles();
        estudiantePersonalizado.mostrarDetalles();

        System.out.println("\n=== PRUEBA EJERCICIO 3: Corrección de error static ===");
        ErrorThisStatic.metodoCorregido("Ejecución sin error de compilación.");
    }
}