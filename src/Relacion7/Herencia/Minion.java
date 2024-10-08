
package Relacion7.Herencia;

public class Minion extends Personaje{
    String tipo;
    public Minion(String nombre, int posVertical, int posHorizontal, String tipo){
        super(nombre, posVertical, posHorizontal,0,0,0);
        this.tipo = tipo;
        switch (tipo) {
            case "Cañon":
                this.tipo = tipo;
                this.puntosVida = 75;
                this.puntosEscudo = 5;
                this.puntosAtaque = 25;
                break;
            case "Mago":
                this.tipo = tipo;
                this.puntosVida = 12;
                this.puntosEscudo = 40;
                this.puntosAtaque = 30;
                break;
            default:
                this.tipo = "Melee";
                this.puntosVida = 50;
                this.puntosEscudo = 10;
                this.puntosAtaque = 10;
                break;
        }
        this.nombre = "minion";
        this.posHorizontal = (int)(Math.random()*(1520-400+1)+400);
        this.posVertical = (int)(Math.random()*(1520-400+1)+400);
        
    }
    
    @Override
    public void atacar(Personaje atacado){
        if (atacado instanceof Minion) {
            atacado.puntosVida -= 10;
            atacado.puntosEscudo -= 20;
        }
        else{
            atacado.puntosVida -= 20;
            atacado.puntosEscudo -= 30;
        }
        
    }
    
}
