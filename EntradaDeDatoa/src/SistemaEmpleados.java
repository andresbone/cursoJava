import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {

        System.out.println("*** Sistema de empleados ***");

        var consola = new Scanner(System.in);

        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        System.out.print("Edad del empleado: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Salario del empleado:");
        var salario = Double.parseDouble(consola.nextLine());

        System.out.print("Es jefe de dedpartamento (true/false?: ");
        var jefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir valores

        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre: "+nombreEmpleado);
        System.out.println("\tEdad: " + edad);
        System.out.printf("\tSalario: $%2f%n",salario);
        System.out.println("\tJefe de departamento: " + jefeDepartamento);

    }
}
