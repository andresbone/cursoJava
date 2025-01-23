import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("Estacion del año con switch ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un mes del año (del 1 al 12): ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = "";
        estacion = switch (mes) {
            case 1,2,12 -> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "verano";
            case 9,10,11 -> "Otoño";
            default -> "Solo del 1 al 12 hpt!";
        };
        System.out.println(estacion);
    }
}
