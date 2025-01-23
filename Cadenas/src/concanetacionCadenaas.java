public class concanetacionCadenaas {
    public static void main(String[] args) {
        var cadena = "Hola";
        var cadena1 = " ";
        var cadena2 = "Mundo";
        var holaMundo = cadena + cadena1 + cadena2;
        System.out.println(holaMundo);

        // Metodo concat
        System.out.println(cadena.concat(" a todas las bandidas"));

        // Clase StringBuilder (Clase notese el camellecase)
        var constructorCadenas = new StringBuffer();
        constructorCadenas.append(cadena);
        constructorCadenas.append(" a todas las bandidas");
        constructorCadenas.append(" bien bichotas wazaaa");
        System.out.println(constructorCadenas);

        // StringBuffer

        var StringBuffer = new StringBuffer();
        StringBuffer.append(cadena).append(" a todos");
        System.out.println(StringBuffer);

        // Join
        var resultado = " ";
        resultado = String.join(" uwuwu ", cadena,cadena1,cadena2,"owowo");
        System.out.println("resultado = " + resultado);

    }
}
