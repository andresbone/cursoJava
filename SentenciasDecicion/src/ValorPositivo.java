import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Determinar si un valor es positivo ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0){
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero, sos un pendejo");
        }
    }
}
