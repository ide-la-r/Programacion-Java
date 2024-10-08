
package estudiar;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Inserta un numero para saber sis divisores: ");
        int numero = teclado.nextInt();
        System.out.println("Los divisores de " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (numero %i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
