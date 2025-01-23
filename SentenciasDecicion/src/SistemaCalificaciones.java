import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema calificaciones ***");

        var consola = new Scanner(System.in);
        var calificacion = "";

        System.out.print("Ingresa tu nota: ");
        var nota = Integer.parseInt(consola.nextLine());

        if (nota >= 9 || nota == 10) {
            calificacion = "A";
        } else if (nota >= 8 && nota < 9) {
            calificacion = "B";
        } else if (nota >= 7 && nota < 8) {
            calificacion = "C";
        } else if (nota >= 6 && nota < 7) {
            calificacion = "D";
        } else if (nota >= 0 && nota < 6) {
            calificacion = "F";
        }else{
            calificacion = "Valor desconocido";
        }

        System.out.printf("Tu nota es %d equivalente a %s ", nota, calificacion);
    }
}
