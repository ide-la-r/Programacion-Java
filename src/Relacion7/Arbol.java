//Compoaicion
package Relacion7;

public class Arbol {
    private double altura;
    private int cantidadHojas;
    private String tipo;
    private double grosor;
    
    private Hoja hojas[];
    
    public Arbol(double altura, int cantidadHojas, String tipo, double grosor){
        this.altura = altura;
        this.cantidadHojas = cantidadHojas;
        this.tipo = tipo;
        this.grosor = grosor;
        
        this.hojas = new  Hoja[cantidadHojas];
        //for (int i = 0; i < cantidadHojas; i++) {
        //    hojas[i] = new Hoja("verde");
        //}
    }
    //Esto es si no tengo el for en el constructor lo hago aqui
    public void germinarHojas(){
        for (int i = 0; i < this.cantidadHojas; i++) {
            hojas[i] = new Hoja("Verde");
        }
    }
    
    @Override
    public String toString(){
        String res = this.tipo + "\n";
        res += "Altura: " + this.altura + "m\n";
        res += "Grosor: " + this.grosor + "cm\n";
        
        res += "Sus hojas son... \n";
        for (int i = 0; i < this.cantidadHojas; i++) {
            if (this.hojas[i] != null) {
                res += this.hojas[i] + "\n";
            }
            else{
                res += "No hay nada dentro\n";
            }
            
        }
        return res;
    }
}
