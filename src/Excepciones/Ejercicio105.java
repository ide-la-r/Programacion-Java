
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio105 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;
        boolean salir = false;
        
        System.out.println("Introduce el numerador: ");
        do {            
            try {
                numerador = teclado.nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("Has introducido un valor que no es el esperado.");
                teclado.next();
            }
        } while (!salir);
        if (numerador > 100) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Se ha detectado una excepcion.");
            }  
        }
        System.out.println("Introduce el denominador: ");
        salir = false;
        do {            
            try {
                denominador = teclado.nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("Has introducido un valor que no es el esperado.");
                teclado.next();
            }
        } while (!salir);
        if (denominador < -5) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Se ha detectado una excepcion.");
            }  
        }
        int cociente = numerador / denominador;
        System.out.println("El cociente es: " + cociente);
    }
    
}
