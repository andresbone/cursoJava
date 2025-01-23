import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Generador de ID unico ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        // Nombre
        System.out.print("\nCual es tu nombre? ");
        var nombre = consola.nextLine();
        // Apellido
        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine();
        // Año de nacimiento
        System.out.print("Cual es tu fecha de nacimiento? (yyyy) ");
        var añoNacimiento = consola.nextLine();
        // Numero aleatorio
        var numeroAleatorio = random.nextInt(9999) + 1;
        // Generar ID
        var idGenerada = new StringBuilder();
        idGenerada.append(nombre.substring(0,2).toUpperCase()).append(apellido.substring(0,2).toUpperCase()).append(añoNacimiento.substring(2,4));

        // Imprimir
        var mensaje ="""
                Hola %s
                \ttu numero de identificacion es: 
                \t%s%04d
                mamahuevo!
                """.formatted(nombre,idGenerada,numeroAleatorio);
        System.out.printf(mensaje);
    }
}
