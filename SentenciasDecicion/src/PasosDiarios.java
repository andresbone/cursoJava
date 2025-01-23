import java.util.Scanner;

public class PasosDiarios {
    public static void main(String[] args) {
        System.out.println("Aplicacion de salud y fitness ***");

        var consola = new Scanner(System.in);
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        System.out.print("¿Cual es tu nombre?: ");
        var nombre = consola.nextLine();
        System.out.print("¿Cuantos pasos caminaste hoy?: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
        var metaPasosDiarios = (pasosDiarios >= META_PASOS_DIARIOS) ? "Meta alcanzada!" : "Vales vrga gordito";
        var mensaje = (pasosDiarios >= META_PASOS_DIARIOS) ? "Felicidades mostro!" : "Move el culo termotanque";

        System.out.printf("""
                %nUsuario: %s
                -----------------------------
                Meta de pasos diarios:  %d 
                Pasos dados hoy: %d %s
                Calorias quemadas: %.2f
                -----------------------------
                %s
                """, nombre, META_PASOS_DIARIOS, pasosDiarios, metaPasosDiarios, caloriasQuemadas, mensaje);

    }
}
