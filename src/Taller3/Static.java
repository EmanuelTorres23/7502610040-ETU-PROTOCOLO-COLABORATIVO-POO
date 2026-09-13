package Taller3;

public class Static {
    int numero = 10;

    public void mostrarMensaje() {
        System.out.println("Método no estático ejecutado correctamente.");
    }

    public static void main(String[] args) {

        Static obj = new Static();
        System.out.println("Valor de la variable no estática: " + obj.numero);
        obj.mostrarMensaje();
    }
}