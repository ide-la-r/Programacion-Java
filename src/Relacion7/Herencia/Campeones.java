
package Relacion7.Herencia;

public class Campeones extends Personaje{
    double puntosMagia;
    int nivel;
    String rol;
    Habilidad lista[] = new Habilidad[4];
    
    public Campeones(String nombre, int posVertical, int posHorizontal, String rol, Habilidad habilidad){
        super(nombre, posVertical, posHorizontal, 0,0,0);
        this.rol = rol;
        this.lista[0] = habilidad;
        this.nivel = 1;
        switch (rol) {
            case "Tanque":
                this.rol = "Tanque";
                this.puntosMagia = 100;
                this.puntosAtaque = (int)(Math.random()*(7-3+1)+7);
                this.puntosVida = (int)(Math.random()*(200-150+1)+200)+150;
                this.puntosEscudo = (int)(Math.random()*(20-15+1)+20);
                break;
            case "Mago":
                this.rol = "Mago";
                this.puntosMagia = 500;
                this.puntosAtaque = (int)(Math.random()*(7-3+1)+7);
                this.puntosVida = (int)(Math.random()*(200-150+1)+200);
                this.puntosEscudo = (int)(Math.random()*(20-15+1)+20)+150;
                break;
            case "Support":
                this.rol = "Support";
                this.puntosMagia = 300;
                this.puntosAtaque = (int)(Math.random()*(7-3+1)+7);
                this.puntosVida = (int)(Math.random()*(200-150+1)+200)+50;
                this.puntosEscudo = (int)(Math.random()*(20-15+1)+20)+50;
                break;
            case "Jungla":
                this.rol = "Jungla";
                this.puntosMagia = 200;
                this.puntosAtaque = (int)(Math.random()*(7-3+1)+7);
                this.puntosVida = (int)(Math.random()*(200-150+1)+200)+100;
                this.puntosEscudo = (int)(Math.random()*(20-15+1)+20);
                break;
            default:
                this.rol = "Carry";
                this.puntosMagia = 300;
                this.puntosAtaque = (int)(Math.random()*(7-3+1)+7);
                this.puntosVida = (int)(Math.random()*(200-150+1)+200);
                this.puntosEscudo = (int)(Math.random()*(20-15+1)+20)+100;
                break;
        }
        this.posHorizontal = (int)(Math.random()*(1920-1000+1)+1000);
        this.posVertical = (int)(Math.random()*(1920-1000+1)+1000);
    }
    
    public void subirNivel(Habilidad nueva){
        this.nivel++;
        this.puntosVida += (int)(Math.random()*(9+1));
        this.puntosEscudo += (int)(Math.random()*(9+1))/10;
        this.puntosAtaque += (int)(Math.random()*(9+1))/10;
        boolean encontrado = false;
        int i = 0;
        while ((this.nivel == 4|| this.nivel == 6 || this.nivel == 8) && !encontrado && i < this.lista.length) {            
            if (this.lista[i]==null) {
               this.lista[i]=nueva;
               encontrado = true;
            }
            i++;
        }
    }
    
    @Override
    public void atacar(Personaje atacado){
        atacado.puntosVida -= 10;
        atacado.puntosEscudo -= 20;
    }
    
}
