
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio104 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int tamaño;
        double lista[] = null;
        boolean salir = false;
        
        try {
            System.out.println("Introduce un numero para el tamaño del array");
            tamaño = teclado.nextInt();
            lista = new double[tamaño];
        } 
        catch (InputMismatchException e) {
            System.out.println("Has introducido un valor que no es correcto");
        }
        
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el dato en el cajon " + i);
            do {               
                try{
                    lista[i] = teclado.nextDouble();
                    salir = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Has introducido un valor no permitido");
                    teclado.next();//cada vez que el usuario meta algo que yo no quiero tengo que limpiar el buffer de teclado, si no se queda en bucle.
                }
            } while (!salir);
            
            
        }
    }
    
}
