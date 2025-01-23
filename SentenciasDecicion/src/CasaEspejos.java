import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("*** casa de los espejos ***");
        final var EDAD_MINIMA = 10;
        var consola = new Scanner(System.in);

        System.out.print("¿Cual es tu edad? ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("¿Le tienes miedo a la oscuridad? (true/false) ");
        var miedosoHpt = Boolean.parseBoolean(consola.nextLine());

        if (edad >= EDAD_MINIMA && !miedosoHpt){
            System.out.println("Puedes pasar bb");
        }else {
            System.out.println("No se admiten bobis");
        }

    }
}
