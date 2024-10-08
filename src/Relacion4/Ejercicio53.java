/*
Haz un programa que dados dos arrays (tamaño y tipo los que tu quieras) diga si
esos arrays son iguales o no. Dos arrays son iguales si sus elementos son iguales y están
en la misma posición.
 */
package Relacion4;

public class Ejercicio53 {

    public static void main(String[] args) {
        int lista1 [] = new int [8];
        int lista2 [] = new int [8];
        int valores1;
        int valores2;
        
        System.out.println("Los numeros que han salido en el primer array son: ");
        for (int i = 0; i < lista1.length; i++) {
            lista1 [i] = (int) (Math.random() * (lista1.length+1));
            valores1 = lista1 [i];
            System.out.print(valores1 + " ");
        }
        System.out.println("Los numeros que han salido en el segundo array son: ");
        for (int i = 0; i < lista2.length; i++) {
            lista2 [i] = (int) (Math.random() * (lista2.length+1));
            valores2 = lista2 [i];
            System.out.print(valores2 + " ");
        }
        System.out.println("Los numeros que son iguales y estan en la misma posicion de los array es/son el: ");
        for (int i = 0; i < lista1.length; i++) {
            if (lista2[i] == lista1[i]) {
                System.out.println(lista1[i] + " ");
        }
        }
        
    }
    
}
