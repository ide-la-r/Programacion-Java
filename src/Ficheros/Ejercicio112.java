
package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio112 {
//no se hacer lo de que si el fichero exixte se borre y se cree de nuevo
    public static void main(String[] args) {
            
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/Ejercicio112.txt";
        BufferedWriter br = null;
        
        try {
            br = new BufferedWriter(new FileWriter(ruta));//el true lo que hace es activar el modo añadir,(como nos dice que se borre quitamos el true)

            //3. escribir lo que necesite
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dime tu nombre>> ");
            String frase = teclado.nextLine();
            br.write(frase);
            br.newLine();
            System.out.println("Dime tu edad>> ");
            int edad = teclado.nextInt();
            br.write(Integer.toString(edad));// esto lo que hace es comvertir un entero a un string para que aparezca el numero en el fichero
            System.out.println("Datos guardados en el fichero Ejercicio112.txt");
            
        } catch (IOException e) {
            System.out.println("Error escribiendo");
        }
        //4.cerrar flujos
        finally{
            
            try {
                if (br != null) br.close();//esto es una manera de poner el if cuando solo tiene una linea
            }
            catch (IOException e) {
                System.out.println("Fallo cerrando flujos");
            }
        }
    }
    
}
