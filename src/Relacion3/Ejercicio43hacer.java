
package Relacion3;

import java.util.Scanner;

public class Ejercicio43hacer {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce la base de el triangulo: ");
        int n = teclado.nextInt();
        
        if (n>0) {
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
        }
        }
        else {
            System.out.println("Has introducido un valor negativo");
        }
    }
    
}
