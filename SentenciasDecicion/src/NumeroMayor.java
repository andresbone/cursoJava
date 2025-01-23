import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        System.out.println("*** Encontrar el mayor de 2 numeros ***");

        var consola = new Scanner(System.in);

        // Pedir los numeros
        System.out.print("Ingresa el primer numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el segundo numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        // Compararlos

        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor");
        }else {
            System.out.println("El numero " + numero2 + " es mayor");
        }

    }
}
