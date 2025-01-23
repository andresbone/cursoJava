import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador ternario ***");

        // Sintaxis: condicion ? exp1 : exp2

        var consola = new Scanner(System.in);

        // Par o impar
        var numero = Integer.parseInt(consola.nextLine());
        var resultado = (numero % 2==0 ) ? "Par" : "Impar";
        System.out.println("resultado = " + resultado);

        // Mayor de edad
        var edad = (numero >= 18) ? "Eres mayor de edad" : "Pocoyo";
        System.out.println("edad = " + edad);

        // Numero positivo , negativo o cero
        
        var cerosqui = (numero >0) ? "Positivo" : (numero <0) ? "negativo" : "cerosqui";
        System.out.println("cerosqui = " + cerosqui);
    }
}
