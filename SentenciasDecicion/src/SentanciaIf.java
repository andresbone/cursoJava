import java.util.Scanner;

public class SentanciaIf {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else if (edad >= 13 && edad <18 ) {
            System.out.println("putito");
        } else{
            System.out.println("niño pendejo");
        }
    }
}
