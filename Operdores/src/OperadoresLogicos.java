public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("*** AND ***");
        boolean a = true, b = false;
        // and (regresa true solo si ambos valores son verdaderos)
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
        // or (regresa true si cualquier (uno o ambos) valor es verdadero)
        resultado = a || b;
        System.out.println("resultado = " + resultado);
        // not ! (invierte el valor logico)
        resultado = !resultado;
        System.out.println("resultado = " + resultado);

    }
}
