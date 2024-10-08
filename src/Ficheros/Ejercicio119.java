
package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio119 {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/Ejercicio119.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            
            //3.leer datos
            String linea = "";
            boolean salir = false;
            String partes [];
            while (!salir) {//tengo que acordarme del orden, siempre es el mismo, por eso si lo pongo en diferente orden da errores
                linea = mibuffer.readLine();//primero
                if (linea != null) {//segundo
                    partes = linea.split(":");
                    if (partes.length == 3) {
                        String item = partes[0];
                        int precio = Integer.parseInt(partes[1]);
                        int cantidad = Integer.parseInt(partes[2]);
                        System.out.println("item:     " + item);
                        System.out.println("precio:   " + precio);
                        System.out.println("cantidad: " + cantidad);
                        System.out.println("");
                    }
                }
                else{
                    salir = true;
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
