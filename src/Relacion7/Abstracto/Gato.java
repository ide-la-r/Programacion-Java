
package Relacion7.Abstracto;

public class Gato extends Mamifero{
    String color;
    boolean castrado;

    public Gato(String color, int numpatas, double peso, int vidamedia) {
        super(numpatas, peso, vidamedia);
        this.color = color;
        this.castrado = false;
    }
    
    @Override
    public void comunicarse(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String toString() {
        String res = "Gatete";
        res += super.toString() + "\n";
        res += "de color: " + this.color + "\n";
        if (this.castrado) {
            res += "Esta castrado";
        }
        else{
            res += "No esta castrado";
        }
        return res;
    }
    
    
    
}
