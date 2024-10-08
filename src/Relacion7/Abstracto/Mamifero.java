
package Relacion7.Abstracto;

public abstract class Mamifero {
    int numpatas;
    double peso;
    int vidamedia;

    public Mamifero(int numpatas, double peso, int vidamedia) {
        this.numpatas = numpatas;
        this.peso = peso;
        this.vidamedia = vidamedia;
    }
    /*Esto no es asi eso funciona pero esta mal no da puntos
    public void comunicarse(){
        
    }*/
    
    public abstract void comunicarse();

    @Override
    public String toString() {
        return "Mamifero{" + "numpatas=" + numpatas + ", peso=" + peso + ", vidamedia=" + vidamedia + '}';
    }
    
    
}
