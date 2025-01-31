import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var valor1 = 0.0;
        var valor2 = 0.0;
        var salir = false;

        while (!salir) {
            System.out.printf("""
                    *** calculadora en Java ***
                    Menu: 
                    1. Suma
                    2. resta
                    3. Multiplicacion
                    4. Division
                    5. salir
                    Escoje una opcion:
                    """);
            // Verificar si la opcion esta dentro del rango permitido
            var opcion = Integer.parseInt(consola.nextLine());
            if (opcion >= 1 && opcion<= 4){
                System.out.print("Primer valor: " );
                valor1 = Double.parseDouble(consola.nextLine());
                System.out.print("Segundo valor: ");
                valor2 = Double.parseDouble(consola.nextLine());
            }

            switch (opcion) {
                case 1 -> { // Suma
                    var suma = valor1 + valor2;
                    System.out.printf("El resultado es: %.2f%n%n", suma);
                }
                case 2 -> { // Resta
                    var resta = valor1 - valor2;
                    System.out.printf("El resultado es: %.2f%n%n", resta);
                }
                case 3 -> { // Multiplicacion
                    var multiplicacion = valor1 * valor2;
                    System.out.printf("El resultado es: %.2f%n%n", multiplicacion);
                }
                case 4 -> { // Division
                    // Validacion (el numerando no puede ser igual a 0)
                    if (valor2 == 0){
                        System.out.println("Error: Divison por cero!");
                    }else {
                        var division = valor1 / valor2;
                        System.out.printf("El resultado es: %.2f%n%n", division);
                    }
                }
                case 5 -> { // Salir del sistema
                    System.out.println("Saliendo del sistema! bye bye oxxo uwu");
                    salir = true;
                }
                default -> {
                    System.out.println("Opcion invalida!");
                }
            }
        }
    }
}
