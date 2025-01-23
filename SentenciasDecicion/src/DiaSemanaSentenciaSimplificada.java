import java.util.Scanner;

public class DiaSemanaSentenciaSimplificada {
    public static void main(String[] args) {
        System.out.println("*** Dias de la semana ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 7: ");
        var dia = Integer.parseInt(consola.nextLine());

        var diaSemana = "";
        diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Te dije del 1 al 7 hpt!";
        };
        System.out.println(diaSemana);
    }
}
