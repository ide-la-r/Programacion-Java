/*
Haz un programa que dado el array valores que posee los números
2,4,6,8,1,3,5,7 genere otro array con los mismos valores pero con el valor 200 en
la posición 4 y el valor 300 en la posición 7 (y el resto de valores afectados desplazados
una posición).
 */
package Relacion4;

public class Ejercicio54 {

    public static void main(String[] args) {
        int lista[] = {2,4,6,8,1,3,5,7};
        int copia[] = new int [lista.length + 2];
        
        System.out.println("La lista es : ");
        for (int i = 0; i < lista.length; i++) {
            copia[i] = lista[i];
            System.out.print(lista[i] + " ");
        }
        System.out.println("La nueva lista con las cosas nuevas es: ");
        for (int i = 0; i < copia.length; i++) {  
            if (i < 3) {
                copia[i] = lista[i];
            }   else if (i == 3) {
                copia[i] = 200;
            }   else if (i > 3 && i < 6) {
                copia[i] = lista[i - 1];
            }   else if (i == 6) {
                copia[i] = 300;
            }   else {
                copia[i] = lista[i - 2];
            }
            System.out.print(copia[i] + " ");
        }
    }
    
}
