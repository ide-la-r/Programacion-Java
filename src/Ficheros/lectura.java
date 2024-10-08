
package Ficheros;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class lectura {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        String ruta = "src/ficheros/datos/waka.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            
            //3.leer datos
            String linea = mibuffer.readLine();
            
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