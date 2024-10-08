
package MB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class T3P1E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor L:");
        int l = teclado.nextInt();
        if (l <= 2) {
            System.out.println("Valor introducido incorrecto.");
            while (l <= 2) {                
                System.out.println("Introduce el valor L:");
                l = teclado.nextInt();
            }
        }
        System.out.println("Introduce el valor N:");
        int n = teclado.nextInt();
        if (n <= 2) {
            System.out.println("Valor introducido incorrecto.");
            while (n <= 2) {                
                System.out.println("Introduce el valor N:");
                n = teclado.nextInt();
            }
        }
        //2.creamos los flujos de lectura
        
        BufferedWriter miBufferedWriter = null;
        try {
            String ruta = "src/MB/numerosB.txt";
            File archivo = new File(ruta);
            miBufferedWriter = new BufferedWriter(new FileWriter(ruta));
            
            //3.leer datos
            if (archivo.exists()) {
                for (int i = 0; i < l; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j < n-1) {
                            miBufferedWriter.write((int)(Math.random()*(200-30+1)+30) + ".");
                        }
                        else{
                            miBufferedWriter.write(Integer.toString((int)(Math.random()*(200-30+1)+30)));
                        }  
                }
                    if (i < l-1) {
                        miBufferedWriter.newLine();
                    }
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado.");
        }
        catch(IOException e){
            System.out.println("Error leyendo.");
        }
        //4.cerrar flujos
        finally{
            try {
                if (miBufferedWriter != null) miBufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el flujo.");
            }
        }
    }
    
}
