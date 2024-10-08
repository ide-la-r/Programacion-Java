
package estudiar;

import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        int pos = 0;
        int vuelta = 0;
        do {            
            System.out.println("Dame un numero: ");
            numero = teclado.nextInt();
            vuelta++;
            if (numero == 12) {
                pos = vuelta;
            }   else if (numero == 0) {
                System.out.println("Ultima aparicion: " + pos);
            }
        } while (numero != 0);
    }
    
}
