
package Relacion7.Herencia;

public class Empleado89 {
    String nombre;
    
    public Empleado89(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Soy el empleado: " + this.nombre;
        return res;
    }
    
}
