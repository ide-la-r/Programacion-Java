
package Relacion7.Herencia;

public class Mago extends Heroe{
    public Mago(String nombre) {
        super(nombre);
        this.inteligencia = (int)(Math.random()*11+1);
        this.fuerza = (int)(Math.random()*6+1);
        this.destreza = (int)(Math.random()*8+1);
        this.vida = (int)(Math.random()*9+1);
    }
    
    public void curarse(){
        this.vida+=3;
        if (this.vida >= 100) {
            this.vida = 100;
        }
        System.out.println(this.nombre+" se ha curado 3 puntos");
    }
    
    @Override
    public boolean esquivar(){
        int alea = (int)(Math.random()*39+1);
        boolean esquiva = false;
        if (alea < this.destreza) {
            esquiva = true;
        }
        return esquiva;
    }
    
    @Override
    public void atacar(Heroe atacado){
        if (!atacado.esquivar()) {
            atacado.vida-=(this.fuerza/2);
        }
        else{
            System.out.println("Ataque esquivado");
        }
    }

    @Override
    public String toString() {
        String res=super.toString();
        res+="Tipo: Mago";
        
        return res;
        
    }
}
