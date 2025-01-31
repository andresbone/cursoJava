import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var saldo = 1000.00;
        var salir = false;

        while (!salir) {
            System.out.printf("""
                    \n*** Cajero automatico ***
                    --------------------------
                    Menu:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    --------------------------
                    Escoge una opcion:\s
                    """);
            var opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo es: $%.2f", saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = Double.parseDouble(consola.nextLine());
                    // Verficamos si el monto del retiro no excede el saldo alctual
                    if (retiro > saldo) {
                        System.out.println("Tu saldo es insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.printf("Tu saldo actual es: $%.2f%n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto del deposito: ");
                    var deposito = Double.parseDouble(consola.nextLine());
                    // Verificamos que el monto no sea menor o igual a 0
                    if (deposito <= 0) {
                        System.out.println("Monto invalido.");
                    } else {
                        saldo += deposito;
                        System.out.printf("Tu asldo actual es: $%.2f%n", saldo);
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida!%n");
            }

        }
    }
}
