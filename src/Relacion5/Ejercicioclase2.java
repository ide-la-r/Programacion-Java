/*
Dada una matriz del tamaño que sea y con valores que quieras:
a) calcula la suma de todos los elementos
b)calcula la media(No se puede usar la variable "contador")
c)Intercambia la primera fila con la ultima(la matriz queda cambiada)
d)Intercambiar la primera columna con la ultima
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicioclase2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("introduce el n umero que quieras que sea la matriz: ");
        int num = teclado.nextInt();
        int n = 0;
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
    }
    
}
