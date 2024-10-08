/*
Crea un array de 100 Crea un array de 100 elementos dónde cada elemento sea un
número aleatorio entre 1 y 100. A continuación muestra por pantalla el mayor y el
menor elemento de ese array
 */
package Relacion4;

public class Ejercicio50 {

    public static void main(String[] args) {
        int lista []= new int[100];
        int maximo=0;
        int minimo=100;
        for (int i = 0; i < lista.length; i++) {
            lista[i]= (int) (Math.random() * (lista.length+1));
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > maximo) {
                maximo = lista[i];
            }
            else if (lista[i] < minimo) {
                minimo = lista[i];
            }
        }
        System.out.println("El mayor elemento del array es: " + maximo);
        System.out.println("El menor elemento del array es: " + minimo);
    }
    
}
