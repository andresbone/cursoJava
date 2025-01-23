import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        var consola = new Scanner(System.in);

        // Int
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        
        // Double
        System.out.print("Ingresa tu altura; ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // String
        // Los metodos nextInt y nextDouble dejan residuos (saltos de linea)
        consola.nextLine(); // Limpia el buffer de entrada
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // conversion de datos

        System.out.print("Ingresa un numero entero: ");
        var numeroEntero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + numeroEntero);

        System.out.println("Ingrese un numero flotante");
        var numeroFloat = Float.parseFloat(consola.nextLine());
        System.out.println("numeroFloat = " + numeroFloat);

    }
}
