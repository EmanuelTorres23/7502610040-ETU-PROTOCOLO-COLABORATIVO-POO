package Taller2;

public class Ejercicio1_Producto {
    private String nombre;
    private double precio;

    public Ejercicio1_Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }

    public static void main(String[] args) {
        Ejercicio1_Producto prod = new Ejercicio1_Producto("Laptop Lenovo", 670000);
        prod.mostrarDetalles();
        System.out.println("¡Ejercicio 1 funcionando!");
    }
}