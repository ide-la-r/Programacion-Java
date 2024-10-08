
package MB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Codificador {
    String ruta;
    String textoOriginal;
    String textoCodificado;
    
    public Codificador(String ruta){
        this.ruta = ruta;
        this.textoOriginal = "";
        this.textoCodificado = "";
    }
    
    public String leerTexto() throws FileNotFoundException, IOException{
        //2.creamos los flujos de lectura
        String ruta = this.ruta;
        BufferedReader mibuffer = null;
        mibuffer = new BufferedReader(new FileReader(ruta));

        //3.leer datos
        String linea = "";
        boolean salir = false;
        if (!ruta.isEmpty()) {
            while (!salir) {                
               linea = mibuffer.readLine();
               if (linea != null) {
                   this.textoOriginal += (linea+"\n");
               }
               else{
                   salir = false;
               }
           }
           if (mibuffer != null) mibuffer.close();
           return this.textoOriginal;
        }else{
            return "";
        }
    }
    
    public String codificar() throws FileNotFoundException, IOException{
        if (!this.textoOriginal.isEmpty()) {
            BufferedReader mibuffer = null;
            BufferedWriter miBufferedWriter = null;
            mibuffer = new BufferedReader(new FileReader(ruta));
            String nuevaRuta = "src/MB/poema.cod";
            File archivo = new File(nuevaRuta);
            miBufferedWriter = new BufferedWriter(new FileWriter(archivo));
            String linea = "";
            boolean salir = false;
            if (!ruta.isEmpty()) {
                while (!salir) {                
                    linea = mibuffer.readLine();
                    if (linea != null) {//no c¡lo codifica pero lo copia, algo es algo.
                        miBufferedWriter.write(linea);
                        miBufferedWriter.newLine();
                    }
                    else{
                        salir = false;
                    }
                }
                if (mibuffer != null) mibuffer.close();
                return this.textoCodificado;
            }
            else{
                 
            }
        }else{
            return "";
        }
        return null;
    }
}
