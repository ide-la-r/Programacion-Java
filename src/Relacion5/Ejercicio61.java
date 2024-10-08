/*
Crea un programa que cree una matriz de 10x10 e introduzca los resultados de las
tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por
pantalla (en forma de matriz)
 */
package Relacion5;

public class Ejercicio61 {

    public static void main(String[] args) {
        int lista [][] = new int[10][10];
        
        //Hacemos la tabla de multiplicar.
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                lista [i][j] = (i + 1) * (j + 1);
            }
        }
        
        //Recorrerlo para sacarlo por pantalla en forma de matriz
        for (int i = 0; i < lista.length; i++) {
            System.out.println("La tabla de multiplicar del " + (i + 1) + " es: ");
            for (int j = 0; j < 10; j++) {
                if (lista[i][j] < 10) {
                    System.out.print("0" + lista[i][j] + " ");
                } else {
                    System.out.print(lista[i][j] + " ");
                }
            }
            System.out.println("\n");
        }
    }
    
}
