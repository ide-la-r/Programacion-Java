
package Relacion7.Herencia;

public abstract class Heroe {
    String nombre;
    int destreza, inteligencia,vida, fuerza;
    boolean muerto;

    public Heroe(String nombre) {
        this.nombre = nombre;
        this.muerto = false;
        this.destreza = 0;
        this.fuerza = 0;
        this.vida = 0;
        this.inteligencia = 0;
    }
    
    public abstract void atacar(Heroe atacado);
    public abstract boolean esquivar();

    @Override
    public String toString() {
        String res="Nombre: "+this.nombre+"\n";
        res+="Inteligencia: "+this.inteligencia+"\n";
        res+="Fuerza: "+this.fuerza+"\n";
        res+="Destreza: "+this.destreza+"\n";
        res+="Vida: "+this.vida+"\n";
        
        return res;
    }
}
