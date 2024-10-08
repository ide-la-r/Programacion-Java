
package Relacion7;

public class arma {
    private String nombre;
    private double resistencia, poder;
    private int nivel;
    
    public arma(String nombre, double resistencia, double poder){
        this.nombre = nombre;
        this.poder = poder;
        this.resistencia = resistencia;
        this.nivel = 1;
    }
    
    public void subirNivel(){
        this.nivel++;
        this.resistencia += 2;
        this.poder += 1;
    }
    
    public double getPoder(){
        return this.poder;
    }
    
    public void setPoder(double nuevoPoder){
        this.poder = nuevoPoder;
    }
    
    public double getResistencia(){
        return this.resistencia;
    }
    
    public void setResistencia(double nuevaResistencia){
        this.resistencia = nuevaResistencia;
    }
    
    public String getNombre(){
        return  this.nombre;
    }

    @Override
    public String toString() {
        return "arma{" + "nombre=" + nombre + ", resistencia=" + resistencia + ", poder=" + poder + '}';
    }
    
}
