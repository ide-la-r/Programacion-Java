
package Relacion8;

public class NotaMusical {
    String valor;
    int duracion;
    
    public NotaMusical(String valor, int duracion){
        this.valor = valor;
        this.duracion = duracion;
    }
    
    @Override
    public String toString(){
        return "{" + this.valor + "," + this.duracion + "}";
    }
}
