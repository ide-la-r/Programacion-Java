/*
Queremos realizar un algoritmo que vaya pidiendo una sucesión de notas por
teclado hasta que se introduzca el valor -1. Tras eso se mostrará la media ponderada de
las notas introducidas. Importante: Hay que controlar que los valores de las notas
introducidas sea el correcto (entre 0 y 10)
 */
package Relacion3;

import java.util.Scanner;

public class Ejercicio38 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce tu nota: ");
        int nota =teclado.nextInt();
        int vuelta=0;
        double media=0;
        do {            
            if (nota<-1||nota>10) {
                System.out.println("Vuelve a intentarlo introduzcalo otra vez: ");
                nota= teclado.nextInt();
            }
            else if (nota>=0&&nota<=10) {
                media += nota;
                vuelta++;

                System.out.println("introduce tu nota: ");
                nota =teclado.nextInt();
            }
        } while (nota!=-1);
        
        media=media/vuelta;
        System.out.println("la media de todo es: "+media);
    }
    
}
