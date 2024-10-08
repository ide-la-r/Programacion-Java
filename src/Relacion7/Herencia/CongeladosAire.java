
package Relacion7.Herencia;

public class CongeladosAire extends Pcongelados{
    double porcentajeNitrogeno;
    double porcentajeOxigeno;
    double porcentajeDcarbono;
    double porcentajeVaporagua;
    
    public CongeladosAire(String Fcaducidad, int Nlote, String Fenvasado, String Porigen, double Tmantenmiento, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDcarbono, double porcentajeVaporagua){
        super(Fcaducidad, Nlote, Fenvasado, Porigen, Tmantenmiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDcarbono = porcentajeDcarbono;
        this.porcentajeVaporagua = porcentajeVaporagua;
    }

    public double getPorcentajeNitrogeno(){
        return porcentajeNitrogeno;
    }

    public double getPorcentajeOxigeno(){
        return porcentajeOxigeno;
    }

    public double getPorcentajeDcarbono(){
        return porcentajeDcarbono;
    }

    public double getPorcentajeVaporagua(){
        return porcentajeVaporagua;
    }
    
    @Override
    public String toString(){
        String res = super.toString();
        res += "El porcentaje de nitrogeno es: " + this.porcentajeNitrogeno + "\n";
        res += "El porcentaje de oxigeno es: " + this.porcentajeOxigeno + "\n";
        res += "El porcentaje de carbono es: " + this.porcentajeDcarbono + "\n";
        res += "El porcentaje de vapor de agua es: " + this.porcentajeVaporagua + "\n";
        return res;
    }
    
}
