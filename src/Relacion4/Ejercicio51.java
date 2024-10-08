/*
Crea un array de 100 elementos dónde cada elemento sea un número aleatorio entre
1 y 100. Realiza los siguientes apartados:
a) Haz un programa que muestre los valores múltiplos de 5.
b) Otro que sólo muestre los números pares.
c) Otro que muestre el mayor de todos los elementos del array y su posición (si hay
varios iguales, muestra el primero)
 */
package Relacion4;

public class Ejercicio51 {

    public static void main(String[] args) {
        int lista[] = new int[100];
        int mayor=0;
        int pos=0;

        System.out.println("Los numeros que han salido son: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * (lista.length + 1));
            System.out.println(lista[i] + " ");
        }
        /*
        Apartado a) 
         */
        System.out.println("Y los multiplos de 5 son: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 5 == 0) {
                System.out.print(lista[i] + " ");
            }
        }
        /*
        Apartado b) 
         */
        System.out.println("Y los numeros pares son: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                System.out.print(lista[i] + " ");
            }
        }
        /*
        Apartado c) 
         */
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor=lista[i];
                pos=i;
            }
        }
        System.out.println("El mayor elemento del array es el numero: " + mayor + " y esta en el puesto: " + pos);
    }

}
