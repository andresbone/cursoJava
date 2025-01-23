public class CicloWhile {
    public static void main(String[] args) {
        // Imprimir numeros pares
         var numero = 0;

         while (numero <= 20) {
             if (numero % 2 == 0){
                 System.out.print(" numero: " + numero);
             }
             numero++;
         }
    }
}
