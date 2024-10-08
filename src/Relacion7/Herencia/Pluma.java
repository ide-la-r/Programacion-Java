
package Relacion7.Herencia;

public class Pluma {
    private double ancho;
    private double largo;
    private String color;

    public Pluma(double ancho, double largo, String color) {
        this.ancho = ancho;
        this.largo = largo;
        switch (color) {
            case "negro":
                this.color = color;
                break;
            case "blanco":
                this.color = color;
                break;
            default:
                this.color = "amarillo";
                break;
        }
    }
    
    @Override
    public String toString(){
        return "P[" + this.color + ": " + this.ancho + "," + this.largo + "]";
    }
    
    
}
