
package Cadenas;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();
        int contador = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                contador++;
            }
        }
        System.out.println("El numero de veces que ha salido la letra a son: " + contador + " veces.");
    }
    
}
