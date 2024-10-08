/*
Diseña un algoritmo que pida dos números por teclado (m y n) y calcule el número
combinatorio de ambos.
El número combinatorio se calcula usando la expresión: m! / n!*(m-n)!
Importante: Hay que obligar a que m >= n.
 */
package Relacion3;

import java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        int n = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        int m = teclado.nextInt();
        int nm=n*m;
        int factorialn=1;
        int factorialm=1;
        int factorialnm=1;
        
        if (m>n) {
            for (int i = n; i >=1; i--){
                factorialn*=n;
            }
            for (int i = m; i >=1; i--) {
                factorialm*=m;
            }
            for (int i = nm; i >=1; i--) {
                factorialnm=factorialm/factorialn*(factorialm-factorialn);
            }
            System.out.println("El numero combinatorio de "+n+" y "+m+" es: "+nm+"! y da : "+factorialnm);
        } else {
            System.out.println("El numero que has determinado en m es mas pequeño que n.");
        }
        
    }
    
}
