public class ComparacionCadenas {
    public static void main(String[] args) {
        // Generacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");
        // Al declarar el (new) creamos un nuevo objeto en la memoria cache

        System.out.print(cadena1 == cadena2);
        // Comparacion de cadenas (==) compara la referencias
        // pregunta si apuntan al mismo objeto en memoria
        // como resultado da (true) porque apuntan al mismo objeto
        System.out.println(cadena1 == cadena3);
        // Da false porque a pesar de valores los mismos valores son objetos diferentes
        // Y las variables apuntan a objetos diferentes
        System.out.println("*** Comparar contenidos ***");
        System.out.println(cadena1.equals(cadena3));
        // (Equals) compara el contenido y no las referencias




    }
}
