
package Relacion7.Herencia;

public class EmpresaAgroalimentaria {
    String Fcaducidad;
    int Nlote;
    
    public EmpresaAgroalimentaria(String Fcaducidad, int Nlote){
        this.Fcaducidad = Fcaducidad;
        this.Nlote = Nlote;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "La fecha de caducidad del producto congelado es: " + this.Fcaducidad + "\n";
        res += "El numero de lote es: " + this.Nlote + "\n";
        return res;
    }
    
}
