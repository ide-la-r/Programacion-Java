
package Cadenas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10 {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        String ruta = "src/Cadenas/Ejercicio10.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            
            //3.leer datos
            String linea = "";
            int contador = 0;
            while (linea != null) {             
                linea = mibuffer.readLine();
                if (linea != null) {
                    System.out.println(linea);
                    contador ++;
                }
            }
            System.out.println("Hay en total " + contador + " lineas");
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: pon la ruta bien mandril!");
        }
        catch(IOException e){
            System.out.println("Error leyendo.");
        }
        //4.cerrar flujos
        finally{
            try {
                if (mibuffer != null) mibuffer.close();// es como un if normal
            } catch (IOException e) {
                System.out.println("Error cerrando el flujo.");
            }
        }
    }
    
}
