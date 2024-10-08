
package Cadenas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        frase = frase.trim();
        String trozos[] = frase.split(" ");//te mete todas las palabras dentro de un hueco distinto, lo hace automatico
        for (int i = 0; i < trozos.length; i++) {
            System.out.println(trozos[i]);
        }
    }
    
}
