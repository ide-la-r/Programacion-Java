/*
Diseña un algoritmo que calcule el factorial de un número pedido por teclado. Pej:
el factorial de 5 es: 5! = 5*4*3*2*1 = 120
 */
package Relacion3;

import java.util.Scanner;

public class Ejercicio39 {

    public static void main(String[] args) {
        Scanner teclado = new  Scanner (System.in);
        System.out.println("Inserta un numero para hacer el factorial: ");
        int n = teclado.nextInt();
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de "+n+" es :"+n+"! = "+factorial);
    }
    
}
