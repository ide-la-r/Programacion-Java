
package estudiar;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe un numero y un exponente para saber la solucion: ");
        int numero = teclado.nextInt();
        int exponente = teclado.nextInt();
        int res = 1;
        for (int i = 0; i < exponente; i++) {
            res *= numero;
        }
        System.out.println("El resultado es: " + res);
    }
    
}
