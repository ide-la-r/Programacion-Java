package Ficheros;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Escritura {//esto es la misma plantilla que la de lectura pero de otra forma

    public static void main(String[] args) {
        
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/ismael.txt";
        BufferedWriter br = null;
        
        try {
            br = new BufferedWriter(new FileWriter(ruta,true));//el true lo que hace es activar el modo añadir, el modo append

            //3. escribir lo que necesite
            
            
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
