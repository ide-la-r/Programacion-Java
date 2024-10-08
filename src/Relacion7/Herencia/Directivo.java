
package Relacion7.Herencia;

public class Directivo extends Empleado89{
    
    public Directivo(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Soy " + this.nombre + " directivo de la empresa";
        return res;
    }
}
