public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        var cadena ="Hola Mundo";
        System.out.println("cadena = " + cadena);

        // Subcadena

        var subcadena1 = cadena.substring(5,10);
        System.out.println("subcadena1 = " + subcadena1);
        System.out.println(cadena.substring(5));

        // Busqueda de subcadenas
        // Indexoff = devuelve el indice de la primera subcadena
        System.out.println(cadena.indexOf("Hola"));
        System.out.println(subcadena1.indexOf("Mundo"));

        // Si la subcadena no es encontrada devuelve -1
        System.out.println(cadena.indexOf("Arroz"));

        // Reemplazar subcadenas

        System.out.println(cadena.replace("Hola","Putas del"));

        // Conc

    }
}
