
package MB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class T3P1E2 {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        String ruta = "src/MB/analisisB.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            
            //3.leer datos
            String linea = "";
            boolean salir = false;
            while (!salir) {                
                linea = mibuffer.readLine();
                int contador1 = 0;
                int contador2 = 0;
                if (linea != null) {
                    for (int i = 0; i < linea.length(); i++) {
                        if (linea.charAt(i) == '[') {
                            contador1++;
                        }
                        if (linea.charAt(i) == ']') {
                            contador2++;
                        }
                    }
                    
                    if (contador1 == contador2) {
                        System.out.println("Linea balanceada.");
                    }
                    else{
                        System.out.println("Linea NO balanceada");
                    }
                }
                else{
                    salir = false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        catch(IOException e){
            System.out.println("Error leyendo.");
        }
        //4.cerrar flujos
        finally{
            try {
                if (mibuffer != null) mibuffer.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el flujo.");
            }
        }
    }
    
}
