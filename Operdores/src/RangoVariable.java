import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Proporcione un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        // Revisamos si esta dentro del rango (entre 1 y 10)
        var dentroRango =  dato >= 1 && dato <= 10;
        System.out.println("dentroRango = " + dentroRango);

        // Revisar la logica inversa, si el dato esta fuera de rango
        var fueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("fueraRango = " + fueraRango);
    }
}
