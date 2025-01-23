import java.util.Scanner;

public class EstacionAño {
    public static void main(String[] args) {
        System.out.println("*** Identificar la estacion del año ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un numero del 1 al 12: ");
        var mes = Integer.parseInt(consola.nextLine());
        
        if (mes == 1 || mes == 2 || mes == 12){
            System.out.println("Invierno");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Primavera");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Verano");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Otoño");
        }else {
            System.out.println("Estacion desconocida");
        }
    }
}
