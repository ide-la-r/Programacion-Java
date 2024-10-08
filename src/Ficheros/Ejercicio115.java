
package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio115 {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/numeros.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            
            //3.leer datos
            String linea = "";
            boolean salir = false;
            int num = 0;
            int num2 = 9999999;
            int contador = 0;
            int contador2 = 0;
            int comparador = 0;
            while (!salir) {
                linea = mibuffer.readLine();
                if (linea != null) {
                    num = Integer.parseInt(linea);
                    if (num < num2) {
                        contador2 = 0;
                        num2 = num;
                    }
                    if (num ==  num2) {
                        contador2++;
                    }
                    if (num > comparador) {
                        contador = 0;
                        comparador = num;
                    }
                    if (num == comparador) {
                            contador++;
                    }
                }
                else{
                    salir = true;
                }
                
            }
            System.out.println("El numero mayor es " + comparador + " y sale " + contador + " veces");
            System.out.println("El numero menor es " + num2 + " y sale " + contador2 + " veces");
            
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
