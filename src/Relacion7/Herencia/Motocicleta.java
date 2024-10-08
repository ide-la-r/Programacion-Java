/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion7.Herencia;

public class Motocicleta extends bicicleta{
    protected int velocidad;
    protected int cilindrada;

    public Motocicleta(int velocidad, int cilindrada, boolean tipo, String color, int nruedas) {
        super(tipo, color, nruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }
    
}
