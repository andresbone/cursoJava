public class CaracteresEspeciales {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        // \n - imprimir un salto de linea

        var cadena1 = "\nHola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        // '\t´- tabulador

        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // '\'' - agrega una comilla doble

        var cadena4 = "\'Hola Mundo\'";
        System.out.println("cadena4 = " + cadena4);

        // \" - agrega una comilla doble
        var cadena5 = "\"Hola Mundo\"";
        System.out.println("cadena5 = " + cadena5);

        // \\ - agrega una diagonal invertida
        
        var cadena6 = "\\Hola Mundo\\";
        System.out.println("cadena6 = " + cadena6);

    }
}
