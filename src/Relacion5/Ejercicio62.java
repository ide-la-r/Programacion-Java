/*
Crea un programa que cree una matriz de tamaño NxM (tamaños introducido por
teclado) e introduzca en ella los valores también a través del teclado teclado. A
continuación deberá mostrar por pantalla cuántos valores son mayores que cero, cuántos
son menores que cero y cuántos son igual a cero (es decir, se muestran 3 números)
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicio62 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el numero de columnas que quieres que tenga la matriz: ");
        int n = teclado.nextInt();
        System.out.println("Introduce el numero de filas que quieres que tenga la matriz: ");
        int m = teclado.nextInt();
        int lista [][] = new int [n][m];
        int mayor = 0;
        int menor = 0;
        int igual = 0;
        
        //Pedir valores de cada hueco de la lista.
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                System.out.println("Introduce el numero que quieras guardar en la columna " + i + " y fila " + j);
                lista[i][j] = teclado.nextInt();
            }
        }
        
        //Mostrar la matriz en forma de matriz.
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] < 10 && lista[i][j] > 0 || lista[i][j] == 0) {
                    System.out.print("0" + lista[i][j] + " ");
                }
                else {
                    System.out.print(lista[i][j] + " ");
                } 
            }
            System.out.println("\n");
        }
        
        //Ver los valores que son mayor de 0.
        System.out.println("Los valores que son mayores que 0 son: ");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] > 0) {
                    mayor++;
                }
            }
        }
        System.out.print(mayor);
        System.out.println("");
        
        //ver los valores menores de 0.
        System.out.println("Los valores que son menores que 0 son: ");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] < 0) {
                    menor++;
                }
            }
        }
        System.out.print(menor);
        System.out.println("");
        
        //ver los valores que son igual a 0.
        System.out.println("Los valores que son iguales que 0 son: ");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] == 0) {
                    igual++;
                }
            }
        }
        System.out.print(igual);
        System.out.print("\n");
    }
    
}
