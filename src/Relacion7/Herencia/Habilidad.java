
package Relacion7.Herencia;

public class Habilidad {
    String nombre;
    private double mana;
    int nivelHab;
    char teclaLanzar;
    private int dañoBasico;
    
    public Habilidad(String nombre, char teclaLanzar){
        this.nombre = nombre;
        this.teclaLanzar = teclaLanzar;
        this.nivelHab = 1;
        this.mana = ((int) (Math.random()* 10 + 1)) + this.nivelHab/2;//Aqui no se castea porque son del mismo tipo
        this.dañoBasico = (int) (((int) (Math.random()*(20-5+1) +5)) + this.mana/3);//se castea porque son tipos diferentes.
    }
    
    public void subirNivel(){
        this.nivelHab++;
        this.mana = ((int) (Math.random()* 10 + 1)) + this.nivelHab/2;
        this.dañoBasico = (int) (((int) (Math.random()*(20-5+1) +5)) + this.mana/3);
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "El nombre de la habilidad es: " + this.nombre +"\n";
        res += "La tecla asignada es: " + this.teclaLanzar;
        return res;
    }
}
