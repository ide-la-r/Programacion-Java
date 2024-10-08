
package Relacion7.Herencia;

public class Persona {
    String nombre;
    int edad;
    double peso;
    int DNI;
    
    
    public Persona(String nombre, int edad, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.DNI = 12345678;
    }
    
    public Persona(){
        this.nombre = "Doctora china";
        this.edad = 28;
        this.peso = 34.0;
        this.DNI = 12345678;
    }
    
    public void mostrarInfoPantalla(){
        System.out.println("Nombre: " + this.edad);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("DNI: " + this.DNI);
    }
    
    public void suFuncion(){
        System.out.println("Hola me llamo ismael");
    }

    @Override
    public String toString(){
        String res = "";
        res +="Nombre: " + this.nombre;
        res +="Edad: " + this.edad;
        res +="Peso: " + this.peso;
        return res;
    }
    
    
}
