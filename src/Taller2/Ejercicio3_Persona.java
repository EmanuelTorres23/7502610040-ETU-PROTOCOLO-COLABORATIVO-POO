package Taller2;

public class Ejercicio3_Persona {
    private String nombre;
    private int edad;

    public Ejercicio3_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        Ejercicio3_Persona per = new Ejercicio3_Persona("Emanuel", 20);
        per.saludar();
        System.out.println("¡Ejercicio 3 funcionando!");
    }
}