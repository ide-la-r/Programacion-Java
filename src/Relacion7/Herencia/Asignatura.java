
package Relacion7.Herencia;

public class Asignatura {
    int codAsignatura;
    int numHoras;
    
    public Asignatura(int codAsignatura, int numHoras){
        this.codAsignatura = codAsignatura;
        this.numHoras = numHoras;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "El codigo de asignatura es: " + this.codAsignatura + "\n";
        res += "El numero de horas que se imparte es: " + this.numHoras;
        return res;
    }
    
}
