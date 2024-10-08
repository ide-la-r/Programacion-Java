
package Relacion7.Herencia;

public class Coche extends Vehiculo{
    protected int velocidad;
    protected int cilindrada;

    public Coche(int velocidad, int cilindrada, String color, int nruedas) {
        super(color, nruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Coche{" + super.toString() + "velocidad=" + velocidad + ", cilindrada=" + cilindrada + '}';
    }
    
}
