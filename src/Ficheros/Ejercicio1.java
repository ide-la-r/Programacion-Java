
package Ficheros;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {
        String ruta = "src/ficheros/datos/ismael.txt";
        BufferedReader mibuffer = null;
        FileReader lector = null;
        String cod1;
        String cod2;  
        String frase;
        int num;
        int vueltas;
        //preguntar a jaime mañana sobre lo de como coger el numero y restarselo a el frase.length
        try {
            lector = new FileReader(ruta);
            mibuffer = new BufferedReader(lector);
            frase = mibuffer.readLine();
            vueltas = Integer.parseInt(frase);
            for (int i = 0; i < vueltas; i++) {
                frase = mibuffer.readLine();
                num = Integer.parseInt(frase);// esto es para combertir a numerl algo que lees del fichero
                frase = mibuffer.readLine();
                cod1 = frase.substring(0,frase.length()-num);
                cod2 = frase.substring(frase.length()-num,frase.length());
                System.out.print(cod2);
                System.out.println(cod1);   
            }
            mibuffer.close();
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("A habido un error leyendo.");
        }
        
    }
    
}
