/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Relacion7.Herencia;

import java.util.Scanner;

public class testVehiculo {

    public static void main(String[] args) {
        Vehiculo lista[] = new Vehiculo[8];
        
        Coche ford = new Coche(120, 2000, "Negro", 4);
        lista[0] = ford;
        Coche tesla = new Coche(180, 1500, "blanco", 4);
        lista[1] = tesla;
        
        bicicleta hb = new bicicleta(false, "naranja", 2);
        lista[2] = hb;
        bicicleta sh = new bicicleta(true, "verde", 2);
        lista[3] = sh;
        
        camioneta polo = new camioneta(100, 100, 3000, "rojo", 4);
        lista[4] = polo;
        camioneta chester = new camioneta(110, 110, 3200, "amarillo", 4);
        lista[5] = chester;
        
        lista[6] = new Motocicleta(130, 275, true, "carmesi", 3);
        lista[7] = new Motocicleta(140, 125, false, "blanco titanio", 3);//Se puede instanciar de las dos maneras.
        
        
        int tam = lista.length;//no hace falta ponerlo pero se recomienda
        for (int i = 0; i < tam; i++) {
            System.out.println(lista[i]);
        }
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Dame un numero de ruedas: ");
        int cantidad = teclado.nextInt();
        
        int contador = 0;
        for (int i = 0; i < tam; i++) {
            if (lista[i].nruedas == cantidad) {
                System.out.println(lista[i]);
                contador++;
            }
        }
        System.out.println("Se han encontrado " + contador + " vehiculos con " + cantidad + " ruedas.");
        //apartado de tocar el timbre
        for (int i = 0; i < tam; i++) {
            if (lista[i] instanceof bicicleta) {//El instanceof es para comparar clases es como un ==
                ((bicicleta) lista[i]).tocarTimbre();//Tienes que castearlo porque en el array java te guarda vehiculos no bicicletas asique hay que castearlo.
            }
        }
        
        for (int i = 0; i < tam; i++) {
            if ((lista[i] instanceof bicicleta) && (!(lista[i] instanceof Motocicleta))) {//Esto lo que hace es decir que sea bicicleta y que no sea motocicleta como si es igual que los ifs de antes
                ((bicicleta) lista[i]).tocarTimbre();
            }
        }
    }
    
}
