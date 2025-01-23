public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos  en Java

        // Enteros valor default (0)
        
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tiposhort = 32000;
        System.out.println("tiposhort = " + tiposhort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9876543210L;
        System.out.println("tipoLong = " + tipoLong); // L o l para indicar el tipo long

        // Punto flotante valor default (0.0)

        float tipoFloat = 3.14F; // F o f para indicar que es float
        System.out.println("tipoFloat = " + tipoFloat); // F o f para indicar el tipo float
        double tipoDouble = 3.13115D;
        System.out.println("tipoDouble = " + tipoDouble); // D o para indicar el tipo double

        // Caracter valor default ('/u0000'(el 0 en valor unicode))

        char tipoChar = 'A'; // Solo puede almacenar un caracter pero ese caracter puede ser cualquiera
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '9';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano valor defautl (false)

        Boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //tipos object (referencia)
        String nombre = null; // valor por default
        System.out.println("nombre = " + nombre);

        



    }
}
