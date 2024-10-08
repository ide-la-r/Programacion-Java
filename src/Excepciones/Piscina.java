package Excepciones;

public class Piscina {
    
    public final int MAXNIVEL;
    private int nivel;
    
    public Piscina(int tope) {
        if (tope<0){
            tope=0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    
    public void quitarAgua(int cantidad) throws PiscinaException{
        if (this.nivel - cantidad <=0) {
            throw new PiscinaException("La piscina no tiene agua, no puedes quitar mas");
        }
        this.nivel -= cantidad;
    }
    
    public void ponerAgua(int cantidad)throws PiscinaException{
        if (this.nivel + cantidad >this.MAXNIVEL) {
            throw new PiscinaException("La piscina no puede tener mas agua");
        }
        this.nivel += cantidad;
    }
}
