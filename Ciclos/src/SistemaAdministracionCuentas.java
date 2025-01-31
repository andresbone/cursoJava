import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        // Comenzar con la iteracion del manu

        while (!salir){
            System.out.printf("""
                    *** sistema de administracion de cuentas ***
                    \s
                    menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir 
                    ----------------------------------------------
                    escoje una opcion:\s
                    """);
            var opcion = Integer.parseInt(consola.nextLine());
            // Evaluar cada opcion
            switch (opcion){
                case 1 -> System.out.println("creando cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema!");
                    salir = true;
                }default -> System.out.println("opcion invalida!");
            }
            System.out.println("bye bye!3");
        }
    }
}
