
package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio120 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //2.creamos los flujos de lectura
        BufferedReader mibuffer = null;
        BufferedWriter miBufferedWriter = null;
        try {
            //3.leer datos
            System.out.println("Introduce el nombre de el primer fichero: ");
            String fichero1 = teclado.nextLine();
            String ruta1 = "src/ficheros/datos/" + fichero1 + ".txt";
            File archivo1 = new File(ruta1);
            if (archivo1.exists()) {
                System.out.println("Introduce el nombre del segundo fichero: ");
                String fichero2 = teclado.nextLine();
                String ruta2 = "src/ficheros/datos/" + fichero2 + ".txt";
                File archivo2 = new File(ruta2);
                if (archivo2.exists()) {
                    String rutanueva = "src/ficheros/datos/" + fichero1 + "-" + fichero2 + ".txt";
                    mibuffer = new BufferedReader(new FileReader(ruta1));
                    File archivonuevo = new File(rutanueva);
                    miBufferedWriter = new BufferedWriter(new FileWriter (rutanueva));
                    String linea = "";
                    boolean salir = false;
                    while (!salir) {
                        linea = mibuffer.readLine();
                        if (linea != null) {
                            miBufferedWriter.write(linea);
                            miBufferedWriter.newLine();
                        }
                        else{
                            salir = true;
                        }
                    }
                    salir = false;
                    mibuffer = new BufferedReader(new FileReader(ruta2));
                    while (!salir) {                        
                        linea = mibuffer.readLine();
                        if (linea != null) {
                            miBufferedWriter.write(linea);
                            miBufferedWriter.newLine();
                        }
                        else{
                            salir = true;
                        }
                    }  
                }
                else{
                    System.out.println("El fichero 2 no existe");
                }
            }
            else{
                System.out.println("El fichero 1 no existe.");
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
                if (miBufferedWriter != null) miBufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el flujo.");
            }
        }
    }
    
}
