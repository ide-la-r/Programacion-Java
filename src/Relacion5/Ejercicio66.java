/*
Implementar el juego de Piedra-Papel-Tijeras para dos jugadores humanos usando
una matriz de comprobaciones: Cada fila corresponde a uno de los tres elementos de
juego. Igual para las columnas. Las celdas de esa matriz tendrá algunos de los
siguientes valores:
• 0 : si el elemento de la fila y el de la columna son el mismo (empate).
• 1: si el elemento de la fila gana al elemento de la columna.
• -1 : si el elemento de la fila pierde contra el elemento de la columna.
 */
package Relacion5;

import java.util.Scanner;

public class Ejercicio66 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //creo la matriz de comprobacion
        int compro [][] = {{0,-1,1},{1,0,-1},{-1,1,0}};
        char eleccion;
        int coordenada = 0;
        int maquina;
        int res;
        
        do {            
            System.out.println("Que elijes ? (r,p,s)");
            eleccion = teclado.nextLine().charAt(0);
            if ((eleccion!='r')&&(eleccion!='p')&&(eleccion!='s')) {
                System.out.println("ERROR! No sabes leer bien. ");
        }
        } while ((eleccion!='r')&&(eleccion!='p')&&(eleccion!='s'));
        //paso el caracter elegido por el jugador a coordenada de la matriz
        switch(eleccion){
            case 'r': coordenada=0; break;
            case 'p': coordenada=1; break;
            case 's': coordenada=2; break;
        }
        //Ahora juega la maquina
        maquina = (int) (Math.random() *3);
        //compruebo quien gana
        res = compro[coordenada][maquina];
        
        switch (res){
            case 0 : System.out.println("Empate!!"); break;
            case 1 : System.out.println("Gana el jugador!!"); break;
            case -1 : System.out.println("Gana la maquina :("); break;
        }
    }
    
}
