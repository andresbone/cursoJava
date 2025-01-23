import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envios ***");

         var consola = new Scanner(System.in);
         final var TARIFA_NACIONAL = 1.25;
         final var TARIFA_INTERNACIONAL = 2.50;
         var tarifaTotal = 0.00;

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine();
        System.out.print("Ingresa el peso del paquete (kg): ");
        var pesoPaquete = Double.parseDouble(consola.nextLine());

        if (destino.equals("nacional")){
            tarifaTotal = pesoPaquete * TARIFA_NACIONAL;
        } else if (destino.equals("internacional")) {
            tarifaTotal = pesoPaquete * TARIFA_INTERNACIONAL;
        }else {
            System.out.println("error, procure solo usar minusculas!");
        }

        System.out.printf("El costo del envio del paquete es: $%.2f", tarifaTotal);
        consola.close();
    }
}
