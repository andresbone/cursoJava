import java.util.Scanner;

public class TiendaOnline {
    public static void main(String[] args) {
        System.out.println("*** Tienda Online ***");

        var consola = new Scanner(System.in);
        var MONTO_MINIMO_D = 1000;

        System.out.print("Ingrese el monto de su compra: ");
        var montoCompra= Integer.parseInt(consola.nextLine());
        System.out.print("Es mienbro de la tienda? (true/false) ");
        var miembroTienda = Boolean.parseBoolean(consola.nextLine());

        if (montoCompra >= MONTO_MINIMO_D && miembroTienda) {
            // Descuento 10%
            var descuentoDiez = montoCompra * 0.10;
            var totalDescuento = montoCompra - descuentoDiez;
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 10%%
                    Monto de la compra: $%d
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """, montoCompra, descuentoDiez, totalDescuento);
        } else if (montoCompra >= MONTO_MINIMO_D || miembroTienda) {
            // Descuento 5%
            var descuentoCinco = montoCompra * 0.05;
            var totalDescuento = montoCompra - descuentoCinco;
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 5%%
                    Monto de la compra: $%d
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """, montoCompra, descuentoCinco, totalDescuento);
        }else{
            System.out.printf("""
                    \nNo obtuviste ningun descuento! (bobin)
                    Te invitamos a hacerte mienbro de la tienda!
                    Monto final de la compra: $%d
                    """, montoCompra);
        }
    }
}
