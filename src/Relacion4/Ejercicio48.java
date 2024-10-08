/*
Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
Crea un programa que, a partir de ese array, muestre por pantalla la media ponderada de
las notas.
 */
package Relacion4;

public class Ejercicio48 {

    public static void main(String[] args) {
        int lista [] = {6,3,9,7,5,8,10,2,4,5};
        double media;
        double vuelta=0;
        
        for (int i = 0; i < lista.length; i++) {
            vuelta+=lista[i];
        }
        media=Math.round(vuelta/lista.length);
        System.out.println("La media ponderada de las notas es: "+media);
    }
    
}
