
package Relacion7;

public class armaMio {
    private String arma;
    private int resistencia;
    private int poder;
    private int nivel;
    
    public armaMio(String arma, int resistencia, int poder){
        this.arma = arma;
        this.resistencia = resistencia;
        this.poder = poder;
        this.nivel = 1;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    public void restarResistencia(){
        if (this.resistencia > 0) {
            this.resistencia --;
        }
    }
    
    public void subirNivel(){
        this.nivel ++;
        this.resistencia += 2;
        this.poder ++;
    }
    
    @Override
    public String toString(){
        String res = "";
        
        return res;
    }
}
