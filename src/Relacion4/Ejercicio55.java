/*
Haz un programa que dado un array valores que posea una serie de números pej
2,4,6,8,1,3,5,7 y un numero que se pida por teclado, indique si ese número está
en el array o no lo está.
 */
package Relacion4;

import java.util.Scanner;

public class Ejercicio55 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int lista[] = {2,4,6,8,1,3,5,7};
        System.out.println("Inserta un numero y intenta adivinar si esta en el array: ");
        int numero = teclado.nextInt();
        int valor = 0;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numero) {
                valor = 1;
            }   
        }
        if (valor == 1) {
            System.out.println("El numero que has puesto esta dentro del array.");
        }   else{
            System.out.println("El numero que has puesto no esta dentro del array.");
        }
    }
    
}
