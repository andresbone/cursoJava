public class PracticaVariables {
    public static void main(String[] args) {

        // Detalles de un producto
        String nombreProducto = "Cafe Buendia";
        float precio = 1.50F;
        int cantidaDisponible = 24;
        boolean disponibleVenta = true;

        // Imprimir los valores
        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidaDisponible);
        System.out.println(disponibleVenta);

        // Editar los datos
        nombreProducto = "Cafe Maldia";
        precio = 3.50F;
        cantidaDisponible = 12;
        disponibleVenta = false;

        // Imprimir los valores
        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidaDisponible);
        System.out.println(disponibleVenta);

    }
}
