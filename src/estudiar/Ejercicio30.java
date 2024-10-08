/*
Escribe un programa que lea de teclado 2 números enteros y saque en pantalla todos
los números que estén entre ellos. Ejemplo:
Introduce primer número: 4
Introduce segundo número: 10
4,5,6,7,8,9,10
 */
package estudiar;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Inserta 2 numeros enteros: ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int mayor;
        int menor;
        
        if (numero1 < numero2) {
            menor = numero1;
            mayor = numero2;
        }   else {
            menor = numero2;
            mayor = numero1;
        }
        
        for (int i = menor; i < mayor; i++) {
            if (i %2 == 0) {
                System.out.print(i + ",");
            } 
        }
        for (int i = mayor; i <= mayor; i++) {
            if (i %2 == 0) {
                System.out.println(i + " ");
            }   
        }
    }
    
}
