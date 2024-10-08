
package Relacion7.Herencia;

public class Oficial extends Operario{
    public Oficial(String nombre, int codigo){
        super(nombre, codigo);
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Soy el oficial " + this.nombre + " con el codigo " + this.getCodigo();
        return res;
    }
}
