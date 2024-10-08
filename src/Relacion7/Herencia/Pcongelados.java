
package Relacion7.Herencia;

public class Pcongelados extends EmpresaAgroalimentaria{
    String Fenvasado;
    String Porigen;
    double Tmantenimiento;
    
    public Pcongelados(String Fcaducidad, int Nlote, String Fenvasado, String Porigen, double Tmantenmiento){
        super(Fcaducidad, Nlote);
        this.Fenvasado = Fenvasado;
        this.Porigen = Porigen;
        this.Tmantenimiento = Tmantenmiento;
    }
    
    @Override
    public String toString(){
        String res = super.toString();
        res += "La fecha de envadaso es: " + this.Fenvasado + "\n";
        res += "El origen es: " + this.Porigen + "\n";
        res += "La temperatura del mantenimiento es :" + this.Tmantenimiento + "\n";
        return res;
    }
    
}
