package Relacion6;

import java.util.Scanner;

public class testPelotas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero de pelotas que quieres dentro del saco");
        int tamaño = teclado.nextInt();
        if (tamaño < 5) {
            while (tamaño < 5) {                
                System.out.println("Has introducido un valor menor de 5 vuelve a intentarlo: ");
                tamaño = teclado.nextInt();
            }
        }
        
        int lista[] = new int [tamaño];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 99);
        }
        Pelotas n1 = new Pelotas(50, 5);
    }
    
}
