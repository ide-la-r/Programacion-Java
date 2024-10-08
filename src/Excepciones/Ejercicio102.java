
package Excepciones;

import java.util.Scanner;

public class Ejercicio102 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();
        System.out.println("Introduce una posicion: ");
        int i = teclado.nextInt();
        try {
            System.out.println(cadena.charAt(i-1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No existe la posicion " + i + " en la cadena");
        }
    }
    
}
