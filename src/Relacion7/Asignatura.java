//Ejemplo agregacion
package Relacion7;

public class Asignatura {
    int nhoras;
    String nombre;
    
    public Asignatura(String nombre, int nhoras){
        this.nhoras = nhoras;
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getNhoras(){
        return this.nhoras;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre + "(" + this.nhoras + "horas)";
    }
}
