public class CicloDoWhile {
    public static void main(String[] args) {

        System.out.println("*** Ciclo Do-While ***");

        var contador = 0;

        do {
            System.out.println(contador++);
        }while (contador <= 3);// El ciclo continúa mientras la opción esté fuera del rango

    }
}
