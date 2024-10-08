
package Relacion6;

public class Cafetera_69 {
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera_69(){
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    //Esto es sobrecarga, para tener dos formas diferfentes de crear una cafetera, asignandole nosotros el valor de la capacidad maxima.
    public Cafetera_69(int capacidadMax){
        this.cantidadActual = 0;
        this.capacidadMaxima = capacidadMax;
    }
    
    public void echarCafe(int cantidad){
        this.cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    
    public void servirTaza(int cantidad){
        cantidadActual -= cantidad;
        if (cantidadActual < 0) {
            cantidadActual = 0;
            
        }
    }
    
    public void cantidadCafe(){
        System.out.println("Quedan " + cantidadActual + "cc de cafe en la cafetera.");
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "La cantidad actual es: " + cantidadActual;
        return res;
    }
}
