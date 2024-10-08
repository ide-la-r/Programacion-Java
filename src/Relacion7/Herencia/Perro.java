/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relacion7.Herencia;

public class Perro extends Mamifero{
    String raza;
    String nombre;
    boolean mezcla;//true es que es de pura raza, false que es mezclado 
    
    public Perro(int numpatas, int mediavida, String raza, String nombre){
        super(numpatas, mediavida);
        this.raza = raza;
        this.nombre = nombre;
        this.mezcla = true;
    }
    
    @Override
    public String comunicarse(){
        return "GUAU! GUAU!";
    }
    
    @Override
    public void dormir(){
        System.out.println("Duermo 18 horas");
    }
    
    public void jugar(){
        System.out.println(this.nombre + " esta jugando");
    }

    public boolean getMezcla(){
        return mezcla;
    }

    public void setMezcla(boolean mezcla){
        this.mezcla = mezcla;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "tengo " + super.getNumpatas() + " patas, mi media de vida es: " + super.getMediavida();
        res += " mi raza es: " + this.raza + " mi nombre es " + this.nombre;
        if (this.mezcla) {
            res += " y soy de pura raza";
        }
        else{
            res += " y soy una mezcla de razas";
        }
        return res;
    }
    
}
