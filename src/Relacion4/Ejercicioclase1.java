/*
Creo un array de 10 cajones double.
Pido al usuario 10 notas validas entre 0 y 10.
Meto cada nota en cada cajon del array por orden.
 */
package Relacion4;

import java.util.Scanner;

public class Ejercicioclase1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lista[] = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("mete el numero que quieras en el cajon " + i + " : ");
            lista[i] = teclado.nextDouble();
            if (lista[i] < 1 || lista[i] > 10) {
                System.out.println("Error es entre 0 y 10, vuelve a introducirlo: ");
                lista[i] = teclado.nextDouble();
            }
        }
        System.out.print("La lista de los numeros que has introducido es: ");
        for (int i = 0; i < 10; i++) {
            if (i >= 0 && i < 9) {
                System.out.print(lista[i] + ",");
            } else {
                System.out.println(lista[i] + " ");
            }
        }
    }

}
