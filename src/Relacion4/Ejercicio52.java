/*
Crea un array de tamaño 10 que sirva para almacenar colores y pide al usuario que
rellene cada posición del array con un color. A continuación indica cuantas veces
aparece el color “rojo” y el color “azul” usando la siguiente salida:
El color 'rojo' aparece X veces en el array.
El color 'azul' aparece Y veces en el array.
Siendo X el número de veces que aparece el rojo en el array e Y el número de veces que aparece el
azul en el array)
 */
package Relacion4;

import java.util.Scanner;

public class Ejercicio52 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String lista[] = new String[10];
        String rojo = "rojo";
        String azul = "azul";
        int x = 0;
        int y = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Inserta un color :");
            lista[i] = teclado.nextLine();
            if (lista[i].equalsIgnoreCase(rojo)) {
                x++;
            } else if (lista[i].equalsIgnoreCase(azul)) {
                y++;
            }
        }
        System.out.println("Las veces que ha salido el color rojo han sido: " + x + " y las veces que ha salido el color azul han sido: " + y);
    }

}
