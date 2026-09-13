package Taller2;

public class Ejercicio1_Coche {
    String marca;
    String modelo;
    static int contadorCoches = 0;

    public Ejercicio1_Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    public static void main(String[] args) {
        mostrarContador();
        Ejercicio1_Coche c1 = new Ejercicio1_Coche("Toyota", "Corolla");
        Ejercicio1_Coche c2 = new Ejercicio1_Coche("Chevrolet", "Spark");
        mostrarContador();
    }
}