
package Cadenas;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;
        String lista [] = frase.split("");

        for (int i = 0; i < frase.length(); i++) {//con un else if no funciona no se porque
            switch (lista[i]) {
                case "a":
                    contadora ++;
                    break;
                case "e":
                    contadore ++;
                    break;
                case "i":
                    contadori ++;
                    break;
                case "o":
                    contadoro ++;
                    break;
                case "u":
                    contadoru ++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El numero de veces que ha salido la letra 'a' a sido: " + contadora + " veces.");
        System.out.println("El numero de veces que ha salido la letra 'e' a sido: " + contadore + " veces.");
        System.out.println("El numero de veces que ha salido la letra 'i' a sido: " + contadori + " veces.");
        System.out.println("El numero de veces que ha salido la letra 'o' a sido: " + contadoro + " veces.");
        System.out.println("El numero de veces que ha salido la letra 'u' a sido: " + contadoru + " veces.");
    }
    
}
