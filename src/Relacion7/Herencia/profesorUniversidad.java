
package Relacion7.Herencia;

public class profesorUniversidad extends Profesor{
    boolean investigar;
    int numHorasinv;
    
    public profesorUniversidad(String nombre, int numAsignaturaTotal, int numHorasinv, int numHoras){
        super(nombre, numAsignaturaTotal);
        this.numHorasinv = numHorasinv;
        this.investigar = true;
        this.numHoras = numHoras;//Cojo la variable porque esta creada en el padre ya y ahora la aplico aqui
        if (this.numHoras < 8) {
            this.numHoras = 0;
            this.investigar = false;
        }
    }
    
    public void investigar(){
        if (this.clase && this.numHoras < 20) {
            System.out.println("No se puede investigar estas dando clase");
        }
        else{
            System.out.println(this.getNombre() + " esta investigando.");
            this.investigar = true;
        }
    }
    
    public void pararInvestigar(){
        if (this.investigar) {
            System.out.println(this.getNombre() + " esta dejando de investigar");
            this.investigar = false;
        }
        else{
            System.out.println("No estas investigando, asique no pudes parar de investigar");
        }
    }
    
    public void avandonarAsignatura(){
        for (int i = this.lista.length; i > 0; i--) {
            if (this.lista[i] != null) {
                this.lista[i] = null;
                this.numHoras -= this.lista[i].numHoras;
                i = -1;
            }
        }
    }
    
    public void cogerAsignatura(Asignatura nueva){
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null && this.numHoras <=25) {
                this.lista[i] = new Asignatura(nueva.codAsignatura,nueva.numHoras);
                this.numHoras += nueva.numHoras;
            }
            else{
                System.out.println("En el hueco " + i + " ya hay una asignatura o has sobre pasado las horas limite que son 25 y tienes " + this.numHoras);
            }
        }
    }
    
    @Override
    public String toString(){
        String res = super.toString();
        if (this.investigar) {
            res += "Estoy investigando\n";
        }
        else{
            res += "No estoy investigando";
        }
        return res;
    }
}
