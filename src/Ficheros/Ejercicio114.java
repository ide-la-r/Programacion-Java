
package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio114 {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/Ejercicio114.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            
            //3.leer datos
            String linea = "";
            boolean salir = false;
            int contador = 1;
            while (!salir) {                
                linea = mibuffer.readLine();
                if (linea != null) {
                    System.out.println(contador + ":" + linea);
                    contador++;
                }
                else{
                    salir = false;
                }
            }
            
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
