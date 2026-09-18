package taller3.ejercicios;

public class MainTaller3 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA EJERCICIO 1: Coche ===");
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Mazda", "3");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        Coche.mostrarCantidadCoches(); //[cite: 3]

        System.out.println("\n=== PRUEBA EJERCICIO 2: Matematicas ===");
        System.out.println("Suma (15 + 5): " + Matematicas.sumar(15, 5));
        System.out.println("Resta (15 - 5): " + Matematicas.restar(15, 5));
        System.out.println("Multiplicación (15 * 5): " + Matematicas.multiplicar(15, 5));
        System.out.println("División (15 / 5): " + Matematicas.dividir(15, 5));

        System.out.println("\n=== PRUEBA EJERCICIO 3: Corrección de error static ===");
        ErrorStaticAtributo obj = new ErrorStaticAtributo();
        ErrorStaticAtributo.mostrarCorregido(obj);
    }
}