/*
Se dice que una matriz M es simétrica perfecta si tiene el mismo número de filas y
de columnas (MxM) y si todos sus elementos cumplen que el elemento de la posición [i]
[j] es el mismo que el de la posición [j][i].
Implementa un programa que analice una matriz (creala y ponle valores tú) e indique si
es simétrica perfecta o no
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicio65 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe de que tamaño quieres tu matriz: ");
        int m = teclado.nextInt();
        int lista[][] = new int[m][m];
        
        boolean estado = true;//si es true esta bien false esta mal.

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.print("Inserta un valor en la fila: " + i + " y la columna " + j + ": ");
                lista[i][j] = teclado.nextInt();
            }
        }
        int comprobar = lista[0][0];
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j] != comprobar) {
                    estado = false;
                }
            }
        }
        if (estado == true) {
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("La matriz no es simetrica.");
        }

    }

}
