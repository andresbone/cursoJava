import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro del rango ***");
        // Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        // Solicitar un valor entre 1 y 5
        System.out.print("Ingresa un numero entre 1 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // Verificar si el dato esta dentro del rango
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("dentroRango? = " + dentroRango);

    }
}
