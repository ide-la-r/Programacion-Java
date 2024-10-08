/*

 */
package Relacion4;

import java.util.Scanner;

public class Ejercicioascensor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int planta = 1; 
        int voy;
        
        do {            
            System.out.println("A que planta vas?");
            voy = teclado.nextInt();
            if (voy < 0 || voy > 10) {
                System.out.println("Ese valor no vale, tiene que ser entre 0 y 10.");
            }   else{
                if (voy > planta) {
                    System.out.println("Subiendo...");
                    for (int i = 0; i <= voy; i++) {
                        System.out.println("Planta " + i + "...");
                    }
                    planta = voy;
                    System.out.println("Estas parado en la planta " + planta);
                }   else if (voy < planta && voy != 0) {
                    System.out.println("Bajando...");
                    for (int i = planta; i >= voy; i--) {
                        System.out.println("Planta " + i + "...");
                    }
                    planta = voy;
                    System.out.println("Estas parado en la planta " + planta);
                }   else if (voy == planta) {
                    planta = voy;
                    System.out.println("Ya estas en la planta " + planta);
                }
                }
        } while (voy != 0);
        planta = 1;
        System.out.println("Apagando ascensor...");
        System.out.println("Ascensor apagado.");
    }
    
}
