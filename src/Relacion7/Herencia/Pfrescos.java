
package Relacion7.Herencia;

public class Pfrescos extends EmpresaAgroalimentaria{
    String Fenvasado;
    String Porigen;
    String Mconservacion;
    
    public Pfrescos(String Fcaducidad, int Nlote, String Fenvasado, String Porigen, String Mconservacion){
        super(Fcaducidad, Nlote);
        this.Fenvasado = Fenvasado;
        this.Porigen = Porigen;
        this.Mconservacion = Mconservacion;
    }
    
}
