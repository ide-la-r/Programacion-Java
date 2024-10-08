/*
Dada una matriz MxM, crear un programa que muestre:
a) El mayor elemento de la diagonal principal.
b) La media de los valores de la diagonal principal.
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicio64 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Indica de que tamaño va a ser la matriz: ");
        int m = teclado.nextInt();
        int lista [][] = new int[m][m];
        int mayor = 0;
        int media = 0;
        
        //Rellenar la matriz con valores aleatorios hasta el 30
        System.out.println("Los valores de la matriz son: ");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                lista[i][j] = (int) (Math.random() * 29);
                if (lista[i][j] < 10) {
                    System.out.print("0" + lista[i][j] + " ");
                }
                else{
                    System.out.print(lista[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
        //Recorrer la matriz y que vea solo los diagonales
        System.out.println("Los nunmeros que estan en la diagonal son: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i][i] + " ");
            if (lista[i][i] > mayor) {
                mayor = lista[i][i];
            }
            media += lista[i][i];
        }
        media = media/m;
        System.out.println("\n");
        System.out.println("El mayor numero de la diagonal es: " + mayor);
        System.out.println("Y la media de las diagonales es: " + media);
        System.out.println("\n");
    }
    
}
