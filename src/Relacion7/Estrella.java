
package Relacion7;

public class Estrella {
    private int x;
    private int y;
    private char forma;
    
    public Estrella(int x, int y){
        this.x = x;
        this.y = y;
        this.forma = this.generarEstrella();
    }
    
    private char generarEstrella(){
        int ale = (int) (Math.random()*3+1);
        if (ale <= 2) {
            return '.';
        }
        else{
            return '*';
        }
    }
    
    @Override
    public String toString(){
        String res = "*";
        if (this.forma == '.') {
            res = ".";
        }
        return res;
    }
}
