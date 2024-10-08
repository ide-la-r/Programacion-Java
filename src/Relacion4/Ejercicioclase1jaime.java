/*
Creo un array de 10 cajones double.
Pido al usuario 10 notas validas entre 0 y 10.
Meto cada nota en cada cajon del array por orden.
 */
package Relacion4;

import java.util.Scanner;

public class Ejercicioclase1jaime {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         double lista[ ] = new double[10];
         double calificacion;
         
         for (int i = 0; i < 10; i++) {
            do {            
            calificacion= teclado.nextDouble();
             if (calificacion<0||calificacion>10) {
                 System.out.println("error repite nota.");
             }
        } while ((calificacion<0)||(calificacion>10));
         lista[0]=calificacion;
        }
         
    }
    
}
