/*
 rellena el array asi :
1 0 0
0 1 0
0 0 1
y saca por pantalla esto: (sin comerte los 0 y los 1 de antes )
*  .  . 
.  *  . 
.  .  * 
 */
package Relacion5;


public class Ejercicioclase {

    public static void main(String[] args) {
        int lista [][] =  new int [3][3];
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (i==j) {
                    lista[i][j]=1;
                } else {
                    lista[i][j]=0;
                }
            }
        }
        
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j]==1) {
                    System.out.print(" * ");
                } else{
                    System.out.print(" . ");
                }
            }
            System.out.println("");
        }    
    }
}
