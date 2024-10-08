/*
Array de 5 elementos
lo inicializo a valores entre 1 y 100 aleatoriamente
busco rl mayor y pos
busco menos y mayor
 */
package Relacion4;

public class Ejercicioclase4 {

    public static void main(String[] args) {
        int lista []= new int[100];
        int maximo=0;
        int minimo=100;
        int posicion1=0;
        int posicion2=0;
        for (int i = 0; i < lista.length; i++) {
            lista[i]= (int) (Math.random() * (lista.length+1));
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > maximo) {
                maximo = lista[i];
                posicion1= i;
            }
            else if (lista[i] <= minimo) {
                minimo = lista[i];
                posicion2=i;
            }
        }
        System.out.println("El mayor elemento del array es: " + maximo+" y su posicion es el numero: "+posicion1);
        System.out.println("El menor elemento del array es: " + minimo+" y su posicion es el numero: "+posicion2);
    }
    
}
