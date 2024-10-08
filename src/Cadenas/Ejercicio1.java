
package Cadenas;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
        
    }
    
}
