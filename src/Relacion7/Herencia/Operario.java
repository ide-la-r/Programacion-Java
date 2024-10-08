
package Relacion7.Herencia;

public class Operario extends Empleado89 {
    private int codigo;
    
    public Operario(String nombre, int codigo){
        super(nombre);
        this.codigo = codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Soy el operarario " + this.nombre + " con el codigo " + this.codigo;
        return res;
    }
}
