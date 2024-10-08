/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion6;

import java.util.Scanner;

public class Heroe {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num= 7;
        
        System.out.println("Vamos a crear un super heroe...");
        
        System.out.println("Introduce la edad: ");
        int edad = teclado.nextInt();
        System.out.println("Introduce la altura: ");
        double altura = teclado.nextDouble();
        System.out.println("Introduce el nombre: ");
        String nombre = teclado.next();
        System.out.println("Introduce el sexo(M/F): ");
        String sexo = teclado.next();
        boolean res = true;
        if (sexo.equalsIgnoreCase("M")) {
            res = false;
        }
        
        //creacion de un objeto
        Heroe1 pepito = new  Heroe1(1.80,17,"super isma",false);
        Heroe1 otro = new  Heroe1(altura,edad,nombre,res);
        Heroe1 agua = new Heroe1(1.87,26,"Superagua", true);
        
        pepito = new Heroe1(otro);
        /*System.out.println(agua);
        //consultar los atributos =>
        System.out.println(pepito.nombre);
        System.out.print("Sexo: ");
        if (pepito.sexo == true) {
            System.out.println("Es chica.");
        } else {
            System.out.println("Es chico.");
        }
        System.out.print("Altura: ");
        System.out.println(pepito.altura);
        
        System.out.println("\n");
        
        System.out.println(otro.nombre);
        System.out.print("Sexo: ");
        if (otro.sexo == true) {
            System.out.println("Es chica.");
        } else {
            System.out.println("Es chico.");
        }
        System.out.print("Altura: ");
        System.out.println(otro.altura);
        
        pepito.volar();
        System.out.println(pepito.energia);
        pepito.pelear(10,"Superdaniel");
        System.out.println(pepito.energia);
        pepito.pelear(20,"auroramaster");
        System.out.println(pepito.energia);
        pepito.dormir();
        System.out.println(pepito.energia);
        pepito.pelear(50,"UltrabossJuanjo");
        System.out.println(pepito.energia);*/
        System.out.println(pepito.getEdad());
    }
    
}
