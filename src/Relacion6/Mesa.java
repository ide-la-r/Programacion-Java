
package Relacion6;

import java.util.Scanner;

public class Mesa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Vamos a ver como es tu mesa...");
        System.out.println("Tu mesa es nueva? (S/N)");
        String nuevo = teclado.nextLine();
        boolean res = true;
        if (nuevo.equalsIgnoreCase("N")) {
            res = false;
        }
        System.out.println("Material de la mesa (madera/metal/plastico): ");
        String material = teclado.nextLine();
        System.out.println("Largo de la mesa: ");
        double largo = teclado.nextDouble();
        System.out.println("Anchura de la mesa: ");
        double anchura = teclado.nextDouble();
        System.out.println("Altura de la mesa: ");
        double altura = teclado.nextDouble();
        System.out.println("Nº de patas : ");
        int nºpatas = teclado.nextInt();
        
        Mesa1 mesaa = new Mesa1(res, material, largo, anchura, altura, nºpatas);
        //Consultar los atributos.
        if (mesaa.nueva == true) {
            System.out.println("Tu mesa es nueva");
        } else {
            System.out.println("Tu mesa no es nueva");
        }
        System.out.println("El material de la mesa es: " + mesaa.material);
        System.out.println("El largo de tu mesa es: " + mesaa.largo);
        System.out.println("La anchura de tu mesa es: " + mesaa.anchura);
        System.out.println("La altura de tu mesa es: " + mesaa.altura);
        System.out.println("El numero de patas que tiene la mesa son: " + mesaa.nºpatas);
        
    }
    
}
