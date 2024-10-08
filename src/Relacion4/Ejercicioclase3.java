/*
Array de numeros: tamaño 8
Meter en cada celda del array un numero aleatorio entre 5 y 10
calcular la suma de los elementos del array
sacar por pantalla en horizontal separado por espacio los elementos del array
mostrar la suma
 */
package Relacion4;

import java.util.Scanner;

public class Ejercicioclase3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int lista [] = new int [8];
        int suma=0;
        
        for (int i = 0; i < lista.length; i++) {
            /*Esto de abajo es la formula de el math que es 10 que es el maximo menos el minimo que es 5 mas 1 que 
            da 6 y luego el 5 que es el minimo.*/
            lista [i] = (int) (Math.random()*(6)+5);
            suma+=lista[i];
        }
        System.out.print("La lista de los numeros que han salido son: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        System.out.print(" y su suma es : "+suma);
    }
    
}
