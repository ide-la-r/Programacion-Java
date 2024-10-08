/*
Usando arrays: escribe un programa que pida 10 números naturales y a
continuación, indique cuál es el valor máximo de esa sucesión de números, el número
de veces que aparece y sus respectivas posiciones. Ejemplo:
7 10 143 10 52 143 72 10 143 7
El valor máximo es el 143
Aparece 3 veces en las posiciones 2,5,8
 */
package Relacion4;

import java.util.Scanner;

public class Ejercicio56 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int lista[] = new int[10];
        int valor = 0;
        int vueltas = 0;
        String posicion = " ";
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Inserta un valor en el cajon " + i);
            lista[i] = teclado.nextInt();
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > valor) {
                valor = lista[i];
            }
        }
        System.out.println("El valor maximo es: " + valor);
        for (int i = 0; i < lista.length; i++) {
            if (valor == lista[i]) {
                vueltas++;
                posicion += i + " ";
            }
        }
        System.out.println("El numero de veces que sale ese numero es: " + vueltas + " y estan en las posiciones: " + posicion);
    }
    
}
