
package Relacion6;

import java.util.Scanner;

public class testReloj {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Reloj numero1 = new  Reloj(23, 05, 54);
        
        /*
        System.out.println("El reloj numero 1 tiene : " + numero1.horas + " horas.");
        System.out.println("El reloj numero 1 tiene : " + numero1.minutos + " minutos.");
        System.out.println("El reloj numero 1 tiene : " + numero1.segundos + " segundos.");
        */
        numero1.encenderse();
        numero1.apagarse();
        numero1.apagarse();
        numero1.encenderse();
        numero1.encenderse();
        numero1.adelantarHora();
        numero1.adelantarSegundos(120);
        System.out.println(numero1);
    }
    
}
