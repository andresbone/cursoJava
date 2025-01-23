public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores aritmeticos ***");
        int  a = 5, b = 3, resultado = 0;
        var c = true;

        // suma (a + b)
        // resta (a - b)
        // multiplicacion (a * b)
        // division ( a / b )
        // residuo ( a % b)

        // Operadores unarios

        // Operador +
        a = +3; // opcional los valores por defecto son positivos
        System.out.println("a = " + a);
        // Operador -
        a = -3; // cambia el valor a negativo

        // Operadores de incremento/decremento

        // Pre-incremento
        resultado = ++a ;
        System.out.println("Pre-incremento: "+a); // El valor se incrementa al instante

        // Post-incremento
        resultado = a++; // El valor se usa primero y luego se incrementa
        System.out.println("Post-incremento: "+resultado); // Se usa el valor
        System.out.println("Post-incremento: "+a); // al ser llamado otra vez se incrementa

        // Pre-drecremento

        System.out.println("b = "+b);
        resultado = --b;
        System.out.println("Pre-decremento: "+b);

        // Post-decremento

        resultado = b--;
        System.out.println(resultado); // Primero se usa el valor
        System.out.println(b); // Luego se incrementa

        for (int i = 0; i <= 10; i++) {
            a = i;
            System.out.println(a);
        }

    }
}
