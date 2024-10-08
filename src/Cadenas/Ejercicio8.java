
package Cadenas;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        frase = frase.toLowerCase();
        String lista [] = frase.split(" ");
        for (int i = 0; i < lista.length; i++) {
            if ("java".equals(lista[i])) {
                lista[i] = "python";
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
    
}
