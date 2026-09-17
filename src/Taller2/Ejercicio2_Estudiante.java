package Taller2;

public class Ejercicio2_Estudiante {
    private String nombre;
    private double promedio;

    public Ejercicio2_Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void mostrarEstado() {
        System.out.println("Estudiante: " + nombre + " | Promedio: " + promedio);
    }

    public static void main(String[] args) {
        Ejercicio2_Estudiante est = new Ejercicio2_Estudiante("Emanuel", 4.5);
        est.mostrarEstado();
    }
}