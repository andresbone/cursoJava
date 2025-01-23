import java.util.Scanner;

public class SistemaAutentificacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autentificacion ***");

        final var USER = "admin";
        final var PASSWORD = "123";
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el ususario: ");
        var user = consola.nextLine();
        System.out.print("Ingrese su contraseña: ");
        var password = consola.nextLine();

        var verificacion = user.equals(USER) && password.equals(PASSWORD);
        System.out.println("verificacion = " + verificacion);
    }
}
