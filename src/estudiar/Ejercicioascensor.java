/*
Ejercicio ascensor
 */
package estudiar;

import java.util.Scanner;

public class Ejercicioascensor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int planta = 1;
        int voy;

        System.out.println("Ascensor esta en la planta " + planta);
        do {
            System.out.println("A que planta vas ?");
            voy = teclado.nextInt();
            if (voy < 0 || voy > 10) {
                System.out.println("Ese valor no vale, tiene que ser entre 0 y 10.");
            } else {
                if (planta < voy) {
                    System.out.println("Subiendo...");
                    for (int i = planta; i <= voy; i++) {
                        System.out.println("Planta " + i + "...");
                    }
                    planta = voy;
                    System.out.println("Estas en la planta " + voy);
                } else if (planta > voy && voy != 0) {
                    System.out.println("Bajando...");
                    for (int i = planta; i >= voy; i--) {
                        System.out.println("Planta" + i + "...");
                    }
                    planta = voy;
                    System.out.println("Estas en la planta " + voy);
                } else if (voy == planta) {
                    System.out.println("Estas ya en la planta " + voy);
                } else if (voy == 0) {
                    System.out.println("Apagando ascensor...");
                    System.out.println("Ascensor apagado.");
                }
            }
            } while (voy != 0);
        }

    }
