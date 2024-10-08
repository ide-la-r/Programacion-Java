
package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio123 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para el tamaño de la lista: ");
        int tamaño = teclado.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introduce un numero en el hueco "+i);
            lista.add(teclado.nextInt());
        }
        //apartado a)
        System.out.println(lista);
        //apartado b) candidato
        if (tamaño > 1) {
            int primero = lista.get(0);
            lista.set(0, lista.get(tamaño-1));// el primero es la posicion de lo que quieres cambiar, y el segundo es lo que quieres poner en esa posicion
            lista.set(tamaño-1, primero);
            System.out.println(lista);
        }
        //apartado c)
        System.out.println("Introduce un numero para el tamaño que quieres ampliar en la lista: ");
        tamaño = teclado.nextInt();
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introduce un nuevo numero: ");
            lista.add(teclado.nextInt());
        }
        //apartado d)
        int suma = 0;
        tamaño = lista.size();
        for (int i = 0; i < tamaño; i++) {
            suma += lista.get(i);
        }
        System.out.println("La suma de todos los numeros del array es de: " + suma);
        //apartado e)
        int media = suma/ tamaño;
        System.out.println("La media de todos los numeros que has metido es de: " + suma/media);
        //apartado f)
        for (int i = 0; i < tamaño; i++) {
            if (lista.get(i) < media) {
                System.out.println(lista.get(i));
            }
        }
    }
    
}
