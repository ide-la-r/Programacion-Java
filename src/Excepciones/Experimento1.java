
package Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;//Esto hay que ponerlo siemre que haya una excepcion de este tipo.

public class Experimento1 {

    public static void main(String[] args) {
        int suma = 0, tam = 0;
        int i = 0;
        boolean condicion = false;
        int lista[] = new int[i];
        
        Scanner entrada = new Scanner(System.in);
        
        do {            
            try{
            System.out.print("Introduce numerador: ");
                tam = entrada.nextInt();
                lista = new int[tam];
                condicion = true;
            } catch(InputMismatchException e){
                System.out.println("Has introducido una cadena no un numero positivo!");
                entrada.nextLine();
            } catch(NegativeArraySizeException e){
                System.out.println("Has introducido un valor negativo, no positivo!");  
            }
        } while (!condicion);

        for (i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 3);
            System.out.println("He metido un " + lista[i]);
        }
        System.out.println("");

        for (i = 1; i < lista.length; i++) {
            try {
                suma += (lista[i] / lista[i - 1]);
            } catch (ArithmeticException e) {
                suma += 0;
            }
        }
        System.out.println("Suma es: " + suma);
       
    }
    
}
