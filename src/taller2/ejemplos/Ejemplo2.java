package taller2.ejemplos;

// Ejemplo 2: Uso de 'this()' para invocar otro constructor de la misma clase[cite: 2]
public class EjemploCorrecto2 {
    private String marca;
    private int velocidadMaxima;

    // Constructor sin parámetros
    public EjemploCorrecto2() {
        this("Desconocida", 0); // Llama al constructor de dos parámetros[cite: 2]
    }

    // Constructor parametrizado
    public EjemploCorrecto2(String marca, int velocidadMaxima) {
        this.marca = marca; //[cite: 2]
        this.velocidadMaxima = velocidadMaxima; //[cite: 2]
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca + ", Velocidad Máxima: " + this.velocidadMaxima + " km/h"); //[cite: 2]
    }
}