package Relacion6;

public class Monstruo {
    String nombre;
    int puntosEsfuerzo = 10;
    int vidasTotales = 7;
    int puntosHambre = 3;
    
    boolean estado = true; //True es que esta vivo
    
    public Monstruo(String nombre){
        this.nombre = nombre;
        
    }
    
    public void comer(){
        if (this.puntosEsfuerzo >= 2 && this.estado) {
            this.puntosEsfuerzo = this.puntosEsfuerzo - 2;
            this.puntosHambre = this.puntosHambre + 2;
            this.comprobarVida();
        }
        else{
            System.out.println("El monstruo no tiene puntos de esfuerzo suficientes");
        }
    }
    
    public void comer(String favorita){
        if (this.puntosEsfuerzo >= 2 && this.estado) {
            this.puntosEsfuerzo = this.puntosEsfuerzo - 2;
            this.puntosHambre = this.puntosHambre + 3;
            this.comprobarVida();
        }
        else{
            System.out.println("El monstruo no tiene puntos de esfuerzo suficientes");
        }
    }
    
    public void comunicarse(){
        if (this.puntosEsfuerzo >= 1 && this.estado) {
            this.puntosEsfuerzo = this.puntosEsfuerzo - 1;
            this.comprobarVida();
        }
        else{
            System.out.println("El monstrue no tiene puntos de esfuerzo suficientes");
        }
    }
    
    public void jugar(){
        if (this.puntosEsfuerzo >= 3 && this.puntosHambre >= 1 && this.estado) {
            this.puntosEsfuerzo = this.puntosEsfuerzo - 3;
            this.puntosHambre = this.puntosHambre - 1;
            this.comprobarVida();
        } 
        else {
            System.out.println("El monstruo no tiene suficientes puntos de esfuerzo o puntos de hambre o esta muerto");
        }
    }
    
    public void dormir(){
        if (this.estado) {
            this.puntosEsfuerzo = this.puntosEsfuerzo + 5;
        }
        else{
            System.out.println("El monstruo esta muerto");
        }
    }
    
    public void comprobarVida(){
        if (this.puntosEsfuerzo == 0 || this.puntosHambre == 0) {
                this.vidasTotales = this.vidasTotales - 1;
                this.puntosEsfuerzo = 10;
                this.puntosHambre = 3;
                if (vidasTotales == 0) {
                    this.estado = false;
                    this.puntosEsfuerzo = - 1;
                    this.puntosHambre = - 1;
                    this.vidasTotales = -1;
            }
        }
    }
    
}
