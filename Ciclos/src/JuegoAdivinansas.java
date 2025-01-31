import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinansas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var random = new Random();
        var numeroIntentos = 0;

        // Constantes
        final int INTENTOS_MAXIMOS = 10;
        final int RANGO_MINIMO = 1;
        final int RANGO_MAXIMO = 25;

        // Generar número aleatorio
        var numeroAleatorio = random.nextInt(RANGO_MAXIMO) + RANGO_MINIMO;

        System.out.println("*** Juego de adivinanzas ***");
        System.out.printf("""
                Reglas:
                1. Tienes %d intentos.
                2. Adivina el número entre %d y %d.
                3. ¡Buena suerte!
                """, INTENTOS_MAXIMOS, RANGO_MINIMO, RANGO_MAXIMO);

        // Bucle principal del juego
        while (numeroIntentos < INTENTOS_MAXIMOS) {
            System.out.print("Ingresa un número: ");
            var numeroIngresado = Integer.parseInt(consola.nextLine());

            if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número secreto es mayor!");
            } else if (numeroIngresado > numeroAleatorio) {
                System.out.println("El número secreto es menor!");
            } else {
                System.out.printf("""
                        ¡Felicidades!
                        El número secreto era: %d
                        Descubriste el número en %d intentos!
                        """, numeroAleatorio, numeroIntentos + 1);
                return; // Terminar el juego si el usuario gana
            }
            numeroIntentos++;
            System.out.println("Número de intentos: " + numeroIntentos);
        }

        // Mensaje de derrota
        System.out.printf("""
                ¡Lo siento! Has agotado tus %d intentos.
                El número secreto era: %d
                """, INTENTOS_MAXIMOS, numeroAleatorio);
    }
}