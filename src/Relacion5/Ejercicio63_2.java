/*
Crea un programa que encuentre el elemento de mayor valor de una matriz y...
a) ... muestre la posición de su primera aparición.
b) ... muestre una lista con las posiciones de todas sus apariciones.
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicio63_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Indica el tamaño de la matriz: ");
        int m = teclado.nextInt();
        int lista [][] = new int[m][m];
        int mayor = 0;
        int posicion = 0;
        int posicion2 = 0;
        
        //Rellenar la matriz con elementos aleatorios hasta 20.
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                lista[i][j] = (int) (Math.random() * 20 + 1);
            }
        }
        
        //Sacarlo por pantalla ajustado
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] < 10) {
                    System.out.print("0" + lista[i][j] + " ");
                } 
                else {
                    System.out.print(lista[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
        //Muestra la primera posicion de la primera vez que aparece.
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] > mayor) {
                    mayor = lista[i][j];
                    posicion = i;
                    posicion2 = j;
                }
            }
        }
        
        //Sacar por pantalla lo que nos pide el ejercicio.
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("La primera aparicion de este numero es en la fila " + (posicion+1) + " y en la columna " + (posicion2+1));
        System.out.println("Las veces que este numero se ha repetido ha sido :");
        
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] == mayor) {
                    System.out.println("En la fila " + (i+1) + " y en la columna " +  (j+1));
                }
            }
        }
    }
    
}
