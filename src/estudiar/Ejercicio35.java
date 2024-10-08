
package estudiar;

import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("inserta el primer numero: ");
        int n = teclado.nextInt();
        System.out.println("inserta el segundo numero: ");
        int m = teclado.nextInt();
        
        System.out.println("Los multiplos de " + n + " entre " + n*m + " son: ");
        for (int i = n; i <= n*m; i+=n) {
            if (i<n*m) {
                System.out.print(i + ",");
            }   else{
                System.out.println(i + " ");
            }
        }
    }
    
}
