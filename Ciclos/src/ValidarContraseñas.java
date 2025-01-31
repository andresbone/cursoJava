import java.util.Scanner;

public class ValidarContraseñas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de validacion de contraseñas ***");

        var consola = new Scanner(System.in);
        var password = "";
        var validarPassword = "";

        do {
            System.out.printf("""
                    Tu contraseña debe tener al menos 6 caracteres!
                    Ingresa tu contraseña:\s
                    """);
            password = consola.nextLine().trim();
        } while (password.length() < 6);

        do {
            System.out.print("Repite tu contraseña: ");
            validarPassword = consola.nextLine().trim();
        } while (!(password.equals(validarPassword)));
        System.out.println("contraseña valida!");
        consola.close();
    }
}