public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de comparacion ***");

        int a = 1, b = 2, c = 3;

        // Igualdad ==
        var resultado = a == b;
        System.out.println(resultado);
        // Distinto
        resultado = a != b;
        System.out.println(resultado);
        // Mayor que >
        resultado = a > b;
        System.out.println(resultado);
        // mayor o igual que >=
        resultado = a >= b;
        System.out.println(resultado);
        // Menor que
        resultado = a < b;
        System.out.println(resultado);
        // Menor o igual que <=
        resultado = a <= b;
        System.out.println("a <= b = " + resultado);

    }
}
