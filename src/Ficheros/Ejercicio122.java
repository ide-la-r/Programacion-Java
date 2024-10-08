
package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio122 {

    public static void main(String[] args) {
        //2.creamos los flujos de lectura
        BufferedReader mibuffer = null;
        BufferedWriter bufferedWriter = null;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del jugador: ");
        String nombre = teclado.nextLine();
        System.out.println("Bienvenido al juego " + nombre);
        
        String rutaJugador = "src/ficheros/datos/" + nombre + ".dat";
        File archivoJugador = new File(rutaJugador);
        
        String rutaHorses = "src/ficheros/datos/horses.dat";
        File archivoHorses = new File(rutaHorses);
        try {            
            //3.leer datos
            String linea = "";
            String dinero = "";
            boolean salir;
            if (archivoJugador.exists()) {
                bufferedWriter = new BufferedWriter(new FileWriter(archivoJugador));
                mibuffer = new BufferedReader(new FileReader(archivoJugador));
                bufferedWriter.write("nombre:Ismael");
                bufferedWriter.newLine();
                bufferedWriter.write("dinero:735");
                bufferedWriter.newLine();
                bufferedWriter.write("aput:56");
                bufferedWriter.newLine();
                bufferedWriter.write("apug:47");
                bufferedWriter.close();// aqui he tenido que cerrarlo porque si no no salia por pantalla
                
                salir = false;
                System.out.println("\nDatos del jugador:");
                while (!salir) {
                    linea = mibuffer.readLine();
                    if (linea != null) {
                        System.out.println(linea);
                        String [] parteDinero = linea.split(":");//apartado g
                        if ( parteDinero[0].equals("dinero") && parteDinero.length == 2) {// esto es porque esta en la posicion 2 el numero de dinero
                            dinero = parteDinero[1];// de 1 porque en el 0 esta el nombre dinero y en el 1 la cantidad de dinero.
                        }
                    }
                    else{
                        salir = true;
                    }
                }
                
            }  
            int dineroJugador = Integer.parseInt(dinero);
            try {
                if (!archivoHorses.exists()) {
                bufferedWriter = new BufferedWriter(new FileWriter(archivoHorses));
                bufferedWriter.write("Drogadicto:17");
                bufferedWriter.newLine();
                bufferedWriter.write("Galleta:26");
                bufferedWriter.newLine();
                bufferedWriter.write("Illo:13");
                bufferedWriter.close();
                mibuffer = new BufferedReader(new FileReader(archivoHorses));
                salir = false;
                System.out.println("\nDatos de los caballos:");
                while (!salir) {
                    linea = mibuffer.readLine();
                    if (linea != null) {
                        String [] caballos = linea.split(":");
                        String nombreCaballo = caballos[0];
                        int victoriasCaballo = Integer.parseInt(caballos[1]);
                        System.out.println("Caballo: " + nombreCaballo + " con " + victoriasCaballo + " victorias.");
                    }
                    else{
                        salir = true;
                    }
                }
                    System.out.println("Elige un caballo por sun nombre: ");
                    String caballoElegido = teclado.nextLine();
                    if (caballoElegido.equalsIgnoreCase("Drogadicto") || caballoElegido.equalsIgnoreCase("Galleta") || caballoElegido.equalsIgnoreCase("Illo")) {
                            System.out.println("Has apostado por el caballo: " + caballoElegido);
                    }
                    else{
                        while (!caballoElegido.equalsIgnoreCase("Drogadicto") && !caballoElegido.equalsIgnoreCase("Galleta") && !caballoElegido.equalsIgnoreCase("Illo")) {
                            System.out.println("Has introducido mal el caballo intentalo de nuevo: ");
                            caballoElegido = teclado.nextLine();
                        } 
                        System.out.println("Has apostado por el caballo: " + caballoElegido);
                    } 
            
                    System.out.println("Introduce tu apuesta (mas de 15€): ");
                    int apuesta = Integer.parseInt(teclado.nextLine());
                    if (apuesta < 15) {
                        while (apuesta < 15) {                                
                            System.out.println("Introduce un numero que sea igual o mayor de 15: ");
                            apuesta = Integer.parseInt(teclado.nextLine());
                        }
                    }
                    try {
                        if (dineroJugador > apuesta) {
                            System.out.println("Has apostado " + apuesta + "€") ;
                        }
                    } catch (Exception e) {
                        System.out.println("No tienes suficiente dinero para poder apostar.");
                    }
                    
                    
                }
                else{
                throw new FileNotFoundException();
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se pueden hacer carreras sin caballos.");
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
                teclado.close();
                if (mibuffer != null) mibuffer.close();// es como un if normal
                if (bufferedWriter != null) bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el flujo.");
            }
        }
    }
}
