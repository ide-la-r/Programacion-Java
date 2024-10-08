
package Relacion6;

public class Urna {
    private int bolanegra;
    private int bolablanca;
    
    public Urna(int bolablanca, int bolanegra){
        this.bolablanca = bolablanca;
        this.bolanegra = bolanegra;
    }
    
    public int getTotalBolas(){
        return (this.bolablanca + this.bolanegra);        
    }
    
    public void extraerBola(){
        int bolasTotales = this.bolablanca + this.bolanegra;
        int aleatorio = (int) (Math.random() * (bolasTotales) + 1);
        char color;
        if (aleatorio <= this.bolablanca){
            color = 'b';
            System.out.println("se ha extraido una bola de color: " + color);
            this.bolablanca--;
        }
        else{
            color = 'n';
            System.out.println("se ha extraido una bola del color: " + color);
            this.bolanegra--;
        }
    }
    
    public void introducirBola(char color){
        if (color == 'n') {
            System.out.println("Se a añadido una bola de color negro");
            this.bolanegra++;
        }
        else if (color == 'b') {
            System.out.println("Se a añadido una bola de color blanco");
            this.bolablanca++;
        }
        else{
            System.out.println("El color que has añadidio no es correcto");
        }
    }
}
