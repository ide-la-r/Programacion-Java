
package Cadenas;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();//asi se hace alrreves
        for (int i = frase.length()-1; i >= 0; i--) {//el length siempre se pone -1 porque te da una posicion de mas, cuenta desde 1 no desde 0
            System.out.print(frase.charAt(i));
        }
    }
    
}
