public class FormatoCadenas {
    public static void main(String[] args) {
        // Formato de texto

        var nombre = "Carlos";
        var edad = 22;
        var salario = 123.33;

        // Formato con comillas dobles

        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);

        // Formato en text block

        System.out.println("""
                informacion del empleado 
                ------------------------
                Nombre: %s
                Edad: %d
                salario: $%.2f
                -------------------------
                """.formatted(nombre, edad, salario));
    }
}
