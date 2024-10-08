
package Relacion7.Herencia;

public class Pajaro {
    private String especie;
    private int edad;
    private Pluma plumas[];
    int aleatorio;
    
    public Pajaro(String especie, int edad){
        this.especie = especie;
        this.edad = edad;
        this.aleatorio = ((int)(Math.random()*75-10+1)+10);
        this.plumas = new Pluma[this.aleatorio];
        for (int i = 0; i < this.aleatorio; i++) {
            this.plumas[i] = new Pluma((int)(Math.random()*3+1), (int)(Math.random()*(6-2+1)+2), "amarillo");
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Pajaro " + this.especie + " con " + this.edad + " años.\n";
        for (int i = 0; i < this.aleatorio; i++) {
            res += "Sus plumas son: " + this.plumas[i] + "\n";
        }
        return res;
    }
}
