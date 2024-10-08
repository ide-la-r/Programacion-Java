
package Relacion7.Herencia;

public class Empleado extends Persona{
    double sueldo;
    
    /*public Empleado(){
        super();//Aqui lo que estoy haciendo es invocando al constructor que no tiene nada dentro
    }*/
    
    //int DNI; Este es lo de ocultacion, puedo ocultar variables heredadas, cambiandole el tipo con el mismo nombre
    String DNI;
    
    public Empleado(){
        this.nombre = "Mr.pirson";
        this.edad = 61;
        this.peso = 80;
        this.sueldo = 2500;
        this.DNI = "123456789";
    }
    
    public Empleado(String nombre, int edad, double peso, double sueldo){
        super(nombre, edad, peso);//Aqui ya lo que estoy haciendo es guardar los valores para que se muestre el hijo y no el padre, el padre seria lo de arriba
        this.sueldo = sueldo; //este se hace aparte porque en el constructor del padre no esta el sueldo.
    }
    //Si yo en algun momento quiero utilizar el tostring del padre puedes hacer un metodo que se encargue de esto porwue al hacer el override se carga al del persona.
    public String toStringPadre(){
        return super.toString();
    }
    
    @Override
    public void mostrarInfoPantalla(){
        System.out.println("Nombre: " + this.edad);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("DNI: " + this.DNI);
    }
    
    @Override//se pone esto porque ya exisate en el padre por si no me interesa la vuelvo a escribir
    public void suFuncion(){
        System.out.println("Soy empleado de la super empresa de la mama amantisima");
    }
    
    @Override
    public String toString(){
        String res = super.toString() + "Sueldo: " + this.sueldo;//Aqui lo que hago es llamar al tostring de persona y le añado el sueldo, para ahorrar codigo.
        return res;
    }
}
