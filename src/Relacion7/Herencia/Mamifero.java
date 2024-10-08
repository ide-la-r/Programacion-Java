
package Relacion7.Herencia;

public class Mamifero {
    private int numpatas;
    private int mediavida;
    
    public Mamifero(int numpatas, int mediavida){
        this.numpatas = numpatas;
        this.mediavida = mediavida;
    }
    
    public String comunicarse(){
        return "";
    }
    
    public void dormir(){
        System.out.println("Duermo 8 horas");
    }
    
    public int getNumpatas(){
        return this.numpatas;
    }
    
    public int getMediavida(){
        return this.mediavida;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
