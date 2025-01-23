import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** desea seguir dentro del sistema ***");

        var consola = new Scanner(System.in);

        System.out.print("¿deseas salir del sistema? (true/false) ");
        var continuar = Boolean.parseBoolean(consola.nextLine());

        if (!continuar) {
            System.out.println("Continuamos dentro del sistema!");
        }else {
            System.out.println("Saliendo del sistema!");
        }
    }
}
