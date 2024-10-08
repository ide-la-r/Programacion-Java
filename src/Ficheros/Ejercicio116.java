
package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio116 {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/Ejercicio116.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            
            //3.leer datos
            String linea = "";
            boolean salir = false;
            String ultima = "";
            String primera = "";
            int contador = 0;
            while (!salir) {
                linea = mibuffer.readLine();                
                if (linea != null) {
                    if (linea.length() > primera.length()) {
                        contador = 0;
                        primera = linea;
                    }
                    if (primera.length() == linea.length()) {
                        ultima = linea;
                        contador++;
                    }
                }
                else{
                    salir = true;
                }
            }
            
            //si sale dos veces
            if (contador > 1) {
                System.out.println("La primera que sale mas larga es: " + primera);
                System.out.println("La ultima que sale mas larga es: " + ultima);
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
