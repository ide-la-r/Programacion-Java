/*
Escribe un algoritmo que pida una lista de números enteros uno a uno hasta que se
introduzca el valor 0. A continuación debe escribir por pantalla la posición de la primera
y de la última aparición del número 12 dentro de la lista.
*/
package Relacion3;

import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escriba un numero entre 1-12, si pone 0 el proyecto terminará");
        System.out.println("Dame el numero: ");
        int numero = teclado.nextInt();
        while (numero !=0) {            
            System.out.println("Dame un numero :");
            int numero2 = teclado.nextInt();
            System.out.println(numero2);
            while (numero2 !=0) {                
                System.out.println("Dame un numero: ");
                int numero3=teclado.nextInt();
            }
            System.out.println("has puesto un 0, fin");
        }
        System.out.println("has puesto un 0, fin");
    }
}
