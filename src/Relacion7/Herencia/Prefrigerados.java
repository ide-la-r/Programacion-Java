
package Relacion7.Herencia;

public class Prefrigerados extends EmpresaAgroalimentaria{
    int Corganismo;
    String Fenvasado;
    double Tmantenimiento;
    String Porigen;
    
    public Prefrigerados(String Fcaducidad, int Nlote, int Corganismo, String Fenvasado, double Tmantenimiento, String Porigen){
        super(Fcaducidad, Nlote);
        this.Corganismo = Corganismo;
        this.Fenvasado = Fenvasado;
        this.Tmantenimiento = Tmantenimiento;
        this.Porigen = Porigen;
    }
}
