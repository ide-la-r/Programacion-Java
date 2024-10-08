
package Relacion7.Herencia;

public class bicicleta extends Vehiculo{
    protected boolean tipo;//T-urbana y Fdeportiva

    public bicicleta(boolean tipo, String color, int nruedas) {
        super(color, nruedas);
        this.tipo = tipo;
    }
    
    public void tocarTimbre(){
        System.out.println("RING RING");
    }

    @Override
    public String toString() {
        return "bicicleta{" + super.toString() + "tipo=" + tipo + '}';
    }
    
    
}
