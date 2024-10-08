/*
Realizar un algoritmo que pida por teclado un numero entero y a continuación
muestre todos los divisores de ese número.
*/
package Relacion3;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un numero entero para ver sus divisores");
        int numero = teclado.nextInt();
        
        for ( int i = 1; i <= numero; i++) {
            if (numero % i == 0){
                System.out.println("Uno de los numeros es: "+i);
            }
        }
    }
}
