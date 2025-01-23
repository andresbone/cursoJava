import java.util.Scanner;

public class SistemaAutentificacion {

    public static void main(String[] args) {
        System.out.println("*** Sistema de autentificacion ***");

        final var USER = "admin";
        final var PASSWORD = "123";

        var consola = new Scanner(System.in);

        System.out.print("Ingrese el usuario: ");
        var usuario = consola.nextLine().strip();

        System.out.print("Ingrese la contreseña: ");
        var contraseña = consola.nextLine().strip();

        if (USER.equals(usuario) && PASSWORD.equals(contraseña)){
            System.out.println("¡Bienvenido al sistema!");
        } else if (!USER.equals(usuario) && PASSWORD.equals(contraseña)) {
            System.out.println("Usuario invalido!");
        } else if (USER.equals(usuario) && !PASSWORD.equals(contraseña)) {
            System.out.println("Contraseña invalida!");
        }else {
            System.out.println("Usuario y contraseña invalidos!");
        }

    }
}
