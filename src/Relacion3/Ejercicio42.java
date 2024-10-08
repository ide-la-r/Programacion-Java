/*
Escribe un algoritmo que lea por teclado un número N entero positivo y dibuje un
cuadrado de asteriscos de lado N. Pej: Si el número es 4, se obtiene:
        * * * *
        * * * *
        * * * *
        * * * *
 */
package Relacion3;

import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el tamaño de el cuadrado, el numero tiene que ser positivo : ");
        int n = teclado.nextInt();
        if (n>0) {
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=n; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
        }
        }
        else {
            System.out.println("Has introducido un valor negativo");
        }
    }
    
}
