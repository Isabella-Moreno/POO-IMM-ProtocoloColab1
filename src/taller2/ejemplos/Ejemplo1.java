package taller2.ejemplos;

// Ejemplo 1: Uso de 'this' para diferenciar atributos de parámetros[cite: 2]
public class EjemploCorrecto1 {
    private String marca;

    public EjemploCorrecto1(String marca) {
        this.marca = marca; // 'this.marca' se refiere al atributo de la clase[cite: 2]
    }

    public void setMarca(String marca) {
        this.marca = marca; // Evita la ambigüedad con el parámetro formal[cite: 2]
    }

    public void mostrarMarca() {
        System.out.println("Marca del coche: " + this.marca); //[cite: 2]
    }
}