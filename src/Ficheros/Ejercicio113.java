
package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio113 {

    public static void main(String[] args) {
        
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/Ejercicio113.txt";
        BufferedWriter br = null;
        
        try {
            br = new BufferedWriter(new FileWriter(ruta,true));

            //3. escribir lo que necesite
            Scanner teclado = new Scanner(System.in);
            boolean salir = true;
            System.out.println("Introduce una frase, deja en blanco si quieres salir:");
            String frase = teclado.nextLine();
            while (!frase.isEmpty()) { //esto es que si lo que introduzco esta vacio se sale.               
                br.write(frase);
                br.newLine();
                System.out.println("Introduce una frase, deja en blanco si quieres salir:");
                frase = teclado.nextLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error escribiendo");
        }
        //4.cerrar flujos
        finally{
            
            try {
                if (br != null) br.close();
            }
            catch (IOException e) {
                System.out.println("Fallo cerrando flujos");
            }
        }
    }
    
}
