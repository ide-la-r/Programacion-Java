/*
Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
del 1 al 25 y luego muestre la matriz por pantalla (en forma de matriz)
 */
package Relacion5;

public class Ejercicio60 {

    public static void main(String[] args) {
        int lista [][] = new int [5][5];
        int valor = 0;
        
        //Rellenamos la matriz del 1 al 25.
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                valor = valor + 1;
                lista[i][j] = valor;
            }
        }
        
        //Mostrar la matriz en forma de matriz.
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j] < 10) {
                    System.out.print("0" + lista[i][j] + " ");
                }
                else {
                    System.out.print(lista[i][j] + " ");
                } 
            }
            System.out.println("\n");
        }
    }
    
}
