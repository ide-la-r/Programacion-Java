
package Relacion7.Herencia;

public class Vehiculo {
    protected String color;
    protected int nruedas;

    public Vehiculo(String color, int nruedas) {
        this.color = color;
        this.nruedas = nruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", nruedas=" + nruedas + '}';
    }
    
    
}
