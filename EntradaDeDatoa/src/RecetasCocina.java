import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");

        var consola = new Scanner(System.in);

        // Variables
        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingrese los ingredientes principales: ");
        var ingredientesPrincipales = consola.nextLine();
        System.out.print("Ingrese el tiempo de preparacion (Min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la dificultad de la receta (Facil,Media,Alta): ");
        var dificultad = consola.nextLine();

        // Imprimir los valores
        System.out.println("\n--- Receta de cocina ---");
        System.out.println("\tReceta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientesPrincipales);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion + " Min");
        System.out.println("\tDificultad: " + dificultad);


    }
}
