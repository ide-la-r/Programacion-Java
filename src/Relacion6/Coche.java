
package Relacion6;

public class Coche {
    String color;
    double altura;
    double anchura;
    int nºpuertas;
    final int nºruedas = 4;
    int gasolina;
    final int MAXGASOLINA = 50;
    
    boolean parar = true;//True esta parado y false que esta en movimiento.
    
    public Coche(String color, double  altura, double anchura, int nºpuertas){
        this.color = color;
        this.altura = altura;
        this.anchura = anchura;
        this.nºpuertas = nºpuertas;
        
        this.parar = true;
    }
    //Sobrecarga
    public Coche (int nºpuertas){
        this.color = "rosa";
        this.altura = 1.45;
        this.anchura = 5.67;
        this.nºpuertas = nºpuertas;
        
        this.parar = true;
    }
    
    public void arrancar(){
        if (this.parar == true) {
            System.out.println("El coche se esta arrancando.");
            this.parar = false;
        }
        else {
            System.out.println("El coche ya esta arrancado.");
        }
    }
    
    public void parar(){
        if (this.parar == false) {
            System.out.println("El coche se esta parando.");
            this.parar = true;
        }
        else {
            System.out.println("El coche ya esta parado.");
        }
    }
    
    public void desplazarse(){
        if (parar == false) {
            System.out.println("El coche se esta desplazando.");
            this.gasolina -=20;
        }
        else {
            System.out.println("El coche esta parado no puede desplazarse.");
        }
    }
    
    public void echarGasolina(int cantidad){
        if (this.parar == false) {
            System.out.println("No puedes hechare gasolina el coche no esta parado."); 
        }
        else{
            this.gasolina += cantidad;
            if (this.gasolina > this.MAXGASOLINA) {
                this.gasolina = this.MAXGASOLINA;
            }
        }
    }
    
    public void pintar(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        String res = "";
        res = "COCHE\n";
        res += this.color + "\n";
        //Aqui hay que poner los demas valores.
        return res;
    }
    
}