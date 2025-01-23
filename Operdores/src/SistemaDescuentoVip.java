import java.util.Scanner;

public class SistemaDescuentoVip {
    public static void main(String[] args) {
        System.out.println("*** Sistena de descuento vip ***");

        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tiene la menbresia de la tienda? (true/false) ");
        var tieneMenbresia = Boolean.parseBoolean(consola.nextLine());

        var aplicaDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tieneMenbresia;
        System.out.println("aplicaDescuento? = " + aplicaDescuento);
    }
}
