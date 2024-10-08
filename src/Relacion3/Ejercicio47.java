/*
El juego de las bolas:
Este es un juego donde el jugador compite contra la máquina. Para ello:
• El usuario comienza introduciendo un numero natural positivo que representará
la cantidad de bolas inicial que hay en una urna.
• A continuación, la maquina decide quien empieza de forma aleatoria.
• En cada turno, el usuario o la máquina podrán retirar 1,2 ó 3 bolas (es decir,
eligen restar 1, 2 o 3).
◦ Si es el jugador, se le preguntará cuantas bolas quiere sacar (hay que
controlar que sean 1, 2 o 3).
◦ Si es la máquina, decidirá de forma aleatoria si saca 1,2 o 3 bolas.
• Los turnos se repiten de forma alternativa hasta que uno de los dos retira la
última bola. Quien haga eso, pierde
 */
package Relacion3;

import java.util.Scanner;

public class Ejercicio47 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("   EL JUEGO DE TOCAR LAS BOLAS");
        System.out.println("----------------------------------");
        System.out.println("Ingrese una cantidad de bolas");
        int bolas = teclado.nextInt();

        int sacabola;
        int sacajugador;
        boolean turnoUsuario = Math.random() < 0.5;
        if (!turnoUsuario) {
            System.out.println("Empieza la maquina");
        } else {
            System.out.println("Empiezas tu ");
        }
        while (bolas > 0) {
            if (!turnoUsuario) {
                if (bolas > 10) {
                    sacabola = (int) (Math.random() * (3) + 1);
                    System.out.println("La maquina ya saco bola");
                    bolas -= sacabola;
                } else if (bolas > 5 && bolas <= 10) {
                    sacabola = 3;
                    System.out.println("La maquina ya saco bola");
                    bolas -= sacabola;
                } else if (bolas >= 1 && bolas <= 5) {
                    sacabola = 1;
                    System.out.println("La maquina ya saco bola");
                    bolas -= sacabola;
                }
            } else {
                do {
                    System.out.println("Cuantas bolas quieres sacar?");
                    sacajugador = teclado.nextInt();
                    if (sacajugador == 1 || sacajugador == 2 || sacajugador == 3) {
                        bolas -= sacajugador;
                    } else {
                        System.out.println("Debes de sacar 1,2 o 3 bolas");
                    }
                } while (sacajugador < 1 || sacajugador > 3);
            }
            turnoUsuario = !turnoUsuario;
        }
        if (turnoUsuario && bolas == 0) {
            System.out.println("La maquina ha ganado!!!");
        } else {
            System.out.println("El jugador ha ganado!!!");
        }
        teclado.close();
    }
    
}
