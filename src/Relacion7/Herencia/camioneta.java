
package Relacion7.Herencia;

public class camioneta extends Coche{
    protected double carga;//TARA

    public camioneta(double carga, int velocidad, int cilindrada, String color, int nruedas) {
        super(velocidad, cilindrada, color, nruedas);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "camioneta{" + "carga=" + carga + '}';
    }
    
}
