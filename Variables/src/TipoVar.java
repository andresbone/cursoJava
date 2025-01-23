public class TipoVar {
    public static void main(String[] args) {

        System.out.println("*** Uso de var en java ***");

        // sin usar var
        int numero = 1;
        System.out.println("numero = " + numero);

        // usando var
        var numeroVar = 2;
        System.out.println("numeroVar = " + numeroVar);

        System.out.println("*** Concanetacion de cadenas ***");

        var nombre = "Carlos";
        var apellido = "Anchundia";
        var nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        System.out.println("*** Constantes ***");
        final int DIAS_SEMANA = 7;


    }
}
