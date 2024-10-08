/*
Crea un programa que encuentre el elemento de mayor valor de una matriz y...
a) ... muestre la posición de su primera aparición.
b) ... muestre una lista con las posiciones de todas sus apariciones.
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicio63 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce el numero que quieres que quieres que sea la matriz:");
        int num = teclado.nextInt();
        int n = 0;
        int mayor = 0;
        int posicion = 0;
        int posicion2 = 0;
        int lista [][]= new int [num][num];
        //relleno la matriz con valores aleatorios
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                n = (int) (Math.random() * 20);
                lista [i][j] = n;
                
            }
        }
        //Saco por pantalla ajustando las cifras
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j]<10) {
                    System.out.print("0");
                }
                System.out.print(lista[i][j]+ " ");
            }
            System.out.println("\n");
        }
        //Calculo el mayor y la primera posicion
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j]>mayor) {
                    mayor = lista[i][j];
                    posicion = i;
                    posicion2 = j;
                }
            }
        }
        System.out.println("El numero mayor de la matriz es: " + mayor);
        System.out.println("Su primera aparicion es en la fila: " + posicion + " y en la columna " + posicion2);
        System.out.println("Las veces que se repiten son en : ");
        //Sacamos la lista de veces que se repite
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j]==mayor) {
                    System.out.println("La fila " + (i) + " columna " + (j));
                }
            }
        }
    }
    
}
