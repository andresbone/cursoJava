import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("*** Calcular area y el perimetro de un rectangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        var base = Float.parseFloat(consola.nextLine());
        System.out.print("Ingrese la altura del rectangulo: ");
        var altura = Float.parseFloat(consola.nextLine());

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.printf("""
                   Datos del rectangulo   
                   --------------------
                   Area: %2f
                   Altura: %2f
                """, area, perimetro);
    }
}
