
package Cadenas;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado.nextLine();
        String lista [] = frase.split(" ");
        String palabrotas [] = {"mierda","puta","gilipollas","guarro"};
        for (int i = 0; i < lista.length; i++) {
            if (palabrotas[0].equals(lista[i])) {
                lista[i] = "******";
            }
            else if (palabrotas[1].equals(lista[i])) {
                lista[i] = "****";
            }
            else if (palabrotas[2].equals(lista[i])) {
                lista[i] = "**********";
            }
            else if (palabrotas[3].equals(lista[i])) {
                lista[i] = "******";
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
    
}
