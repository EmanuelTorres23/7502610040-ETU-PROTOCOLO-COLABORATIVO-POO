package Taller2;

public class Ejercicio1_Producto {

    private String nombre;
    private double precio;

    public Ejercicio1_Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void main(String[] args) {
        Ejercicio1_Producto prod = new Ejercicio1_Producto("Laptop Lenovo", 6700000);

        prod.mostrarProducto();
    }
}