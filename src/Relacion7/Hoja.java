//COMPOS DEL BUENO. Del que se compra en el leroy
//Composicion
package Relacion7;

public class Hoja {
    private String color;
    private double anchura;
    private double altura;
    private double grosor;
    
    public Hoja(String color){
        this.color = color;
        this.anchura = (int) (Math.random()*30+1);//esto es a 30
        this.altura = (int) (Math.random()*100+1);
        this.grosor = (int) (Math.random()*5+1);
    }
    
    public Hoja(String color, double anchura, double altura, double grosor){
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.grosor = grosor;
    }
    
    @Override
    public String toString(){
        return "Hoja{ Color=" + this.color + ", anchura=" + this.anchura + ", altura=" + this.altura + "}";
    }
    
}
