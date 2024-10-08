
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testPersona {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero: ");
            int a = teclado.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Error al introducir por teclado");
        }
        
       /* Persona p = null;
        int a=5;
        try {
            System.out.println(p);
            System.out.println(a/0);
        } catch (NullPointerException e){
            System.out.println("Error en p");
        } catch (ArithmeticException e){
            System.out.println("Error aritmetico");
        } catch (Exception e){
            System.out.println("general");
        } finally {
            System.out.println("Esto es como un default añadido");
        }*/
       
    }
    
}
