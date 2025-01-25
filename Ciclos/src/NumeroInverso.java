
public class NumeroInverso {
    public static void main(String[] args) {

        System.out.println("*** Imprimir los numeros del 10 al 1 ***");
        var i = 10; // se establece el contador en 10

        do {
            System.out.println(i--); // se imprime la variable y se le resta 1
        }while (i > 0); // Mientras i sea mayor a 0

        System.out.println("*** Imprimir los numeros imparees del 0 al 20 ***");

        var contador = 0    ;

        do {
            if (contador % 2 == 0) {
                contador++;
            }else {
                System.out.println(contador++); // Imprimimos los numeros impares
            }
        }while (contador < 20 ); // Mientras el contador sea menor a 20
    }
}
