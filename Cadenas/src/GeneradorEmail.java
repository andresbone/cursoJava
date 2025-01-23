import java.util.Scanner;

public class GeneradorEmail {
    public static void main(String[] args) {
        
        System.out.println("*** Generador de Emails ***\n");

        var consola = new Scanner(System.in);
        // Variables
        System.out.println("Ingrese su nombre completo: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre completo: " +  nombre);

        System.out.println("\nIngrese el nombre de la empresa: ");
        var nombreEmpresa = consola.nextLine();
        System.out.println("Nombre de la Empresa : " + nombreEmpresa);

        System.out.println("\nIngrese la extension de dominio: ");
        var extensionDominio = consola.nextLine();
        System.out.println("extension de dominio : " + extensionDominio);

        System.out.println("\n*** Normalizar los datos ***\n");

        // Normalizar nombre de usuario
        var nombreNormalizado = nombre.strip().replace(" ",".").toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);
        // Normalizar nombre de la empresa
        var dominioNormalizado = "@"+ nombreEmpresa.strip().replace(" ",".").toLowerCase() + extensionDominio;
        System.out.println("dominioNormalizado = " + dominioNormalizado);
        // Resultado final
        System.out.println("\n*** Resultado Final ***\n");
        System.out.println("Email final generado = "+ nombreNormalizado+dominioNormalizado);
        
        
    }
}
