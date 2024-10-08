/*
Adivina el número:
Crea un programa que simule el juego de adivinar un número. El funcionamiento del
juego es el siguiente:
• El programa “piensa” un número entero aleatorio entre 1 y 100.
• A continuación pide un número entero al usuario.
• Mientras el número del usuario no sea el número “pensado”, el juego no acaba.
• Si el número del usuario es mayor que el “pensado”, se debe mostrar el mensaje:
“Te has pasado!!”
• Si el número del usuario es menor que el “pensado”, se debe mostrar el mensaje:
“Te has quedado corto!!”
• Cuando el usuario meta el mismo número que el “pensado”, se muestra el
mensaje: “Lo logrates!” y el juego acaba.
 */
package Relacion3;

import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int n= 1;
        int pensamiento = (int)(Math.random()*((100-n)+1)+n);
        System.out.println("He pensado un numero, dime tu jugada: ");
        int jugada = teclado.nextInt();
        
        while (jugada!= pensamiento) {            
            if (jugada>pensamiento) {
                System.out.println("Ted has pasado!!");
            }
            else if (jugada<pensamiento) {
                System.out.println("Te has quedado corto!!");
            }
            jugada= teclado.nextInt();
        }
        System.out.println("Has ganado");
    }
    
}
