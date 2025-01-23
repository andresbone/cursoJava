import java.util.Scanner;

public class SistemaPrestamosLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de prestamos de libros ***");
        final var DISTANCIA_REQUERIDA = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con menbresia? (true/false) ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos km vive de la biblioteca? (km) ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var aplicaPrestamo = tieneMembresia || distanciaBiblioteca <= DISTANCIA_REQUERIDA;
        System.out.println("aplicaPrestamo? = " + aplicaPrestamo);
    }
}
