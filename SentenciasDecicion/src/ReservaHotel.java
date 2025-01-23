import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reservaciones de hotel ***");

        var consola = new Scanner(System.in);
        final var CON_VISTA_MAR = 190.50;
        final var SIN_VISTA_MAR = 150.50;

        // Nombre del cliente
        System.out.print("Ingrese su nombre: ");
        var nombreusuario = consola.nextLine();
        // Dias de estadia
        System.out.print("Ingrese los dias de su estadia: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        // El cuarto con vista al mar
        System.out.print("El cuarto dispone de vista al mar? (true/false): ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());
        // Tiene vista al mar?
        var conVistaMar = (vistaMar) ? "Si ;)" : "Povre no tiene vista al mar";

        // Calcula la tarifa
        double tarifaTotal;
        if (vistaMar) {
            tarifaTotal = diasEstadia * CON_VISTA_MAR;
        } else {
            tarifaTotal = diasEstadia * SIN_VISTA_MAR;
        }

        // Imprime el mensaje
        System.out.printf("""
                -------- Detalles reservacion --------
                \tCliente: %s
                \tDias de estadia: %d dias
                \tCosto total: $%.2f
                \tHabitacion con vista al mar: %s
                """, nombreusuario, diasEstadia, tarifaTotal, conVistaMar);
    }
}