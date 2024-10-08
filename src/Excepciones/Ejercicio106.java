
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio106 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int random = (int) (Math.random() * 10) + 1;
        int contador = 0;
        boolean salir = false;
        int numero = 0;
        do {            
            try {
                System.out.println("Intenta adivinar el numero: ");
                numero = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Has introducido un valor no esperado.");
                teclado.next();
            }
            if (numero == random) {
                    System.out.println("Enhorabuena lo has logrado, lo has intentado " + (contador+1) + " veces.");
                    salir = true;
                }
                else{
                    System.out.println("No lo has adivinado!");
                    contador ++;
                }
        } while (!salir);
    }
    
}
