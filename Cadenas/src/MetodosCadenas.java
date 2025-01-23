public class MetodosCadenas {
    public static void main(String[] args) {
        // Metodo cadena

        var cadena = "Hola Mundo";
        System.out.println(cadena);

        // Obtener longitud de una cadena

        var longitud = cadena.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres

        var nuevaCadena = cadena.replace('a','i');
        System.out.println("nuevaCadena = " + nuevaCadena); // Reemplaza todos los caracteres que tengan 'a' en un nuevo objeto

        // convertir a mayusculas

        var mayusculas = cadena.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // convertir a minusculas

        System.out.println("minusculas = "+cadena.toLowerCase());

        // Eliminar espacios al inicio y al final

        var cadena2 = " Hola Mundo ";
        System.out.println(cadena2); // Con espacios
        System.out.println(cadena2.trim()); // sin espacios


    }
}
