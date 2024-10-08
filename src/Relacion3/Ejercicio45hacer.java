/*
Realiza un programa que pida al usuario un número entero mayor N mayor a 10.
A continuación, haz que muestre la lista de números del 1 al N sustituyendo los
múltiplos de 3 por la palabra FIZZ y los múltiplos de 5 por la palabra BUZZ. Además,
también deben sustituirse los múltiplos de 3 y 5 por la palabra FIZZBUZZ.

a) Muestra la lista de números en vertical.
b) Muestra la lista de números en horizontal separados por espacio.
c) Muestra la lista de números en horizontal separado por coma (,). Obviamente, el
último valor no debe llevar coma detrás.
 */
package Relacion3;

import java.util.Scanner;

public class Ejercicio45hacer {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("inserta un numero mayor que 10: ");
        int numero = teclado.nextInt();
        if (numero <= 10) {
            while (numero <= 10) {
                System.out.println("Inserte de nuevo el numero");
                numero = teclado.nextInt();
            }
        }

        System.out.println("La lista de numeros es: ");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("a) Lista de números en vertical:");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("b) Lista de números en horizontal separados por espacio:");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FIZZBUZZ ");
            } else if (i % 3 == 0) {
                System.out.print("FIZZ ");
            } else if (i % 5 == 0) {
                System.out.print("BUZZ ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("c) Lista de números en horizontal separados por coma (,):");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.print("FIZZ");
            } else if (i % 5 == 0) {
                System.out.print("BUZZ");
            } else {
                System.out.print(i);
            }

            if (i < numero) {
                System.out.print(", ");
            }
        }
    }

}