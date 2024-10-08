
package Relacion7.Herencia;

public class Tecnico extends Operario{
    public Tecnico(String nombre, int codigo){
        super(nombre, codigo);
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Soy el Tecnico " + this.nombre + " con el codigo " + this.getCodigo();
        return res;
    }
}
