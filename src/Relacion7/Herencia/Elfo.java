
package Relacion7.Herencia;

public class Elfo extends Heroe{
    public Elfo(String nombre) {
        super(nombre);
        this.inteligencia = (int)(Math.random()*8+1);
        this.fuerza = (int)(Math.random()*9+1);
        this.destreza = (int)(Math.random()*11+1);
        this.vida = (int)(Math.random()*8+1);
    }
    
    public void rapidez(){
        this.destreza+=4;
        this.fuerza-=4;
        System.out.println(this.nombre+" ha usado rapidez. Ahora su destreza es "+this.destreza+" y su fuerza es "+this.fuerza);
    }
    
    @Override
    public boolean esquivar(){
        int alea = (int)(Math.random()*47+1);
        boolean esquiva = false;
        if (alea < this.destreza) {
            esquiva = true;
        }
        return esquiva;
    }
    
    @Override
    public void atacar(Heroe atacado){
        if (!atacado.esquivar()) {
            atacado.vida-=(this.fuerza/3);
        }
        else{
            System.out.println("Ataque esquivado");
        }
    }
    
    @Override
    public String toString() {
        String res=super.toString();
        res+="Tipo: Elfo";
        
        return res;
        
    }
}
