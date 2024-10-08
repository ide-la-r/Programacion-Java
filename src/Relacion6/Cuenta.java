
package Relacion6;

public class Cuenta {
    String titular;
    double cantidad;
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    //Hacemos sobrecarga porque dice que una es opcional asique hacemos dos uno con ese y otro sin ese.
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    
    public void ingresar(double ingreso){
        if(ingreso > 0){
            this.cantidad += ingreso;
        }
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void setTitular(String nuevo){
        this.titular = nuevo;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }
    
    public void setCantidad(double nuevo){
        this.cantidad = nuevo;
    }
    
    public void retirar(double cantidad){
        if (this.cantidad -cantidad < 0) {
            System.out.println("Estas tieso no puedes retirar dinero");
        }
        else{
            this.cantidad -= cantidad;
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "";
        return res;
    }
    
}
