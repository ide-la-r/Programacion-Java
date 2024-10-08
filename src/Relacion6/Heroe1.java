/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion6;

import java.lang.management.OperatingSystemMXBean;

public class Heroe1 {
    
    //Atributos de clase
    String nombre;
    double altura;
    private int edad;
    boolean sexo; //true femenino, false masculino
    
    //Atributos propios para funcionar.
    boolean vida; //true esta vivo y false esta muerto
    int energia; //controla los puntos de vida del heroe
    final int MAXENERGY = 100;
    
    //Metodo constructor
    public Heroe1(double altura, int edad, String nombre, boolean sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura; 
        
        this.vida = true;//nace vivo
        this.energia = this.MAXENERGY;
    }
    
    //Constructor de copia
    public Heroe1(Heroe1 origen){
        this.nombre =  origen.nombre;
        this.edad = origen.edad;
        this.sexo = origen.sexo;
        this.altura = origen.altura; 
        
        this.vida = true;//nace vivo
        this.energia = origen.MAXENERGY;
    }
    
    //Metodos de clase - Acciones
    public void  volar(){
        if (this.vida) {
            if (this.energia >= 10) {
            System.out.println(this.nombre + " estoy volando!!");
            this.energia -= 10;
            this.comprobarmuerte();
            }
        }
        else {
            System.out.println(" estoy morido.");
        }
    }
    public void  dormir(){
        if (this.vida) {
            System.out.println(this.nombre + " estoy durmiendo.");
            this.energia += 20;
            if (this.energia > this.MAXENERGY) {
                this.energia = this.MAXENERGY;
            }
        }
        else {
            System.out.println(" estoy morido.");
        }
    }
    public void  pelear(int consumo, String nombreMaligno){
        if (this.vida) {
            if (this.energia >= consumo) {
                System.out.println(this.nombre + " se esta dando de ostias con " + nombreMaligno);
                this.energia -= consumo;
                this.comprobarmuerte();
            }
            else {
                System.out.println("No tienes energia suficiente para pelear.");
            }
        }
        else {
            System.out.println(" estoy morido.");
        }
    }
    public void comprobarmuerte(){
        if (this.energia <= 0) {
                this.vida = false;
                System.out.println("Ha muerto.");
            }
    }
    
    //Metodo get y set, el set es por si el usuario quiere cambiar un valor que es privado(el set recibe pero no devuelve)
    public void setEdad(int nuevaedad){
        this.edad = nuevaedad;
        if (this.edad > 50) {
            this.edad = 50;
        }
    }
    //El get no recibe peri si devuelve, se utiliza para devolver privados, es solo para consultar.
    public int getEdad(){
        return this.edad;
    }
    
    @Override//esto se pone si quieres si no no.
    public String toString(){
        String res = "";
        res += "SUPER HEROE/HEROINA\n";
        res += "Nombre: " + this.nombre + "\n";
        res += "Altura: " + this.altura + "\n";
        res += "Edad: " + this.edad + "\n";
        res += "Energia actual: " + this.energia + "\n";
        return res;
    }
}
