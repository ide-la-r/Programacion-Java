/*
Realizar un programa que calcule el resultado de elevar un número a otro. Para ello,
leerá dos números enteros, la base y el exponente, y calculará el resultado, mostrándolo
en pantalla. No se pueden utilizar las funciones que te calculen automáticamente el
resultado como, por ejemplo, la función Math.pow.
*/
package Relacion3;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escriba el numero entero al que le quieras poner la potencia: ");
        int numero = teclado.nextInt();
        System.out.println("Escribe la potencia: ");
        int exponente = teclado.nextInt();
        int resultado = 1;
        
        while (exponente !=0) {            
            resultado = resultado*numero;
            exponente --;
        }
        System.out.println("El resultado es : "+resultado);
        }
    }

