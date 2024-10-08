
package Relacion6;

public class Lavadora {
    double capacidad;//default
    private String marca;
    protected double peso;
    public boolean conSecadora;

    public Lavadora(double capacidad, String marca, double peso, boolean conSecadora) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.peso = peso;
        this.conSecadora = conSecadora;
    }
    
    
}
