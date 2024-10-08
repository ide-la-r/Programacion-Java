
package Relacion7.Herencia;

public class Guerrero extends Heroe{
    public Guerrero(String nombre) {
        super(nombre);
        this.inteligencia = (int)(Math.random()*3+1);
        this.fuerza = (int)(Math.random()*16+1);
        this.destreza = (int)(Math.random()*10+1);
        this.vida = (int)(Math.random()*13+1);
    }
    
    public void furia(){
        if (this.vida>=7) {
            this.fuerza+=6;
            this.vida-=6;
            System.out.println(this.nombre+" ha usado furia. Ahora su fuerza es "+this.fuerza+" y su vida es "+this.vida);
        }   
    }
    
    @Override
    public boolean esquivar(){
        int alea = (int)(Math.random()*28+1);
        boolean esquiva = false;
        if (alea < this.destreza) {
            esquiva = true;
        }
        return esquiva;
    }
    
    @Override
    public void atacar(Heroe atacado){
        if (!atacado.esquivar()) {
            atacado.vida-=this.fuerza;
        }
        else{
            System.out.println("Ataque esquivado");
        }
    }
    
    @Override
    public String toString() {
        String res=super.toString();
        res+="Tipo: Guerrero";
        
        return res;
        
    }
}
