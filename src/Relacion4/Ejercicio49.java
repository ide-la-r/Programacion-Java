/*
Sea el array flags con los valores: 0,1,0,-1,0,-1,-1,-1,0,0,-1. Crea un
nuevo array llamado tivic que sea copia del anterior.
A continuación recorre el primer array (flags) y cambia todos los valores negativos por
el valor 8.
 */
package Relacion4;

public class Ejercicio49 {

    public static void main(String[] args) {
        int flags[] = {0, 1, 0, -1, 0, -1, -1, -1, 0, 0, -1};
        int tivic[] = new int[flags.length];
        
        for (int i = 0; i < flags.length; i++) {
            tivic[i] = flags[i];
            if (tivic[i] < 0) {
                tivic[i] = 8;
            }
        }
        System.out.println("El nuevo arrayy es: " );
        for (int i = 0; i < flags.length; i++) {
            System.out.print(tivic[i]+" ");
        }
    }

}
