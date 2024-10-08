/*
Implementa un programa que solicite al usuario dos números: n y m. 
A continuación debe mostrar todos los múltiplos de n entre n y m*n.
Ejemplo:
Introduce primer número: 4
Introduce segundo número: 10
Los múltiplos de 4 entre 4 y 40 son: 8,12,16,20,24,28,32,36,40
*/
package Relacion3;

import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        System.out.println("Escribe el primer numero: ");
        int n = teclado.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int m = teclado.nextInt();
        int nm = n*m;
        System.out.print("los multiplos de "+n+" entre "+n+" y "+nm+" son: ");
        for (int i = n; i <= nm; i +=n) {
            if (i!=n) {
                System.out.print(i);
                if (i<nm-n) {
                    System.out.print(",");
                }
            }
        }
        }
    }
    
