/*
Realizar un programa que pida al usuario un numero N entre 3 y 5 y, a
continuación, cree una matriz NxN (N filas, N columnas) cuyos elementos se le van a ir
pidiendo al usuario
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicio59 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa un numero entre 3 y 5 para el el tamaño de la matriz: ");
        int n = teclado.nextInt();
        
        //controlamos que el valor que nos de el usuario sea entre 3 y 5.
        while (n < 3 || n > 5) {            
            System.out.println("El valor que has introducido no esta entre 3 y 5 prueba de nuevo: ");
            n = teclado.nextInt();
        }
        
        //Aqui creamos la matriz con el valor del usuario.
        int lista [][] = new int[n][n];
        
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                System.out.println("Inserta el valor que quieras en la columna " + i + " y la fila " + j + ": ");
                lista[i][j] = teclado.nextInt();
            }
        }
    }
    
}
