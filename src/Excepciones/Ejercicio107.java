/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

public class Ejercicio107 {

    public static void main(String[] args) {
        try {
            int s=4/0;
            System.out.println("El programa sigue");
        } catch (ArithmeticException e) {
            System.out.println("Division por 0");
        } catch (Exception e){
            System.out.println("Excepcion general");
        }
        System.out.println("Final del main");
    }
    
}
