
package Relacion7.Herencia;

public abstract class Personaje {
    protected String nombre;
    protected int posVertical;
    protected int posHorizontal;
    protected double puntosVida;
    protected double puntosEscudo;
    protected double puntosAtaque;

    public Personaje(String nombre, int posVertical, int posHorizontal, double puntosVida, double puntosEscudo, double puntosAtaque) {
        this.nombre = nombre;
        this.posVertical = posVertical;
        this.posHorizontal = posHorizontal;
        this.puntosVida = puntosVida;
        this.puntosEscudo = puntosEscudo;
        this.puntosAtaque = puntosAtaque;
    }
    
    public void desplazarse(int x, int y){
        this.posHorizontal += x;
        this.posVertical += y;
        if (this.posHorizontal < 0) {
            this.posHorizontal = 0;
        }
        if (this.posVertical < 0) {
            this.posVertical = 0;
        }
    }
    
    public abstract void atacar(Personaje atacado);
    
    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", posVertical=" + posVertical + ", posHorizontal=" + 
                posHorizontal + ", puntosVida=" + puntosVida + ", puntosEscudo=" + puntosEscudo + ", puntosAtaque=" + puntosAtaque + '}';
    }
    
    
}
