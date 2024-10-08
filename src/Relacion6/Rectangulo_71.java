
package Relacion6;

public class Rectangulo_71 {
    private int base;
    private int altura;
    int area;
    int perimetro;
    
    public Rectangulo_71(int base, int altura){
        this.base = base;
        this.altura = altura;
        this.area = base * altura;
        this.perimetro = 2 * (base + altura);
    }
    
    public void calcularArea(){
        this.area = (this.altura * this.base);
    }
    
    public void calcularPerimetro(){
        this.perimetro = (2 * (this.base + this.altura));
    }
    
    public void representar(){
        System.out.println("-----------------------------------------");
        System.out.println("Rectángulo con base " + this.base + " y altura " + this.altura);
        System.out.print("Area: "); 
        System.out.println(this.area);
        System.out.print("Perimetro: "); 
        System.out.println(this.perimetro);
        System.out.println("-----------------------------------------");
    }
}
