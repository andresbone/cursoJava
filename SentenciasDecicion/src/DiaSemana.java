import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Dias de la semana ***");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona un dia del 1 al 7: ");
        var dia = Integer.parseInt(consola.nextLine());

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Te dije del 1 al 7 sapo hpt");
        }
    }
}
