
package Relacion7.Herencia;

public class Profesor {
    private String nombre;
    protected Asignatura lista[];
    protected int numHoras;
    protected boolean clase;//true que esta dando clase, false que no
    protected int asigInpartidas;
    
    public Profesor(String nombre, int numAsignaturaTotal){//El numero asignaturaTotal es solo para hacer el math ramdom
        this.nombre = nombre;
        this.lista = new Asignatura[numAsignaturaTotal]; //Esto es como lo que te pide al principio pero no es asi luego lo pisa
        this.clase = false; //Suponemos que un maestro "nace" sin dar clase
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = null;
        }
        this.asigInpartidas = (int)(Math.random()* numAsignaturaTotal +1);
        for (int i = 0; i < this.asigInpartidas; i++) {
            this.lista[i] =new Asignatura(((int) (Math.random()* (200-100+1)+100)),((int) (Math.random()* (8-3+1)+3)));//esto puedo crear variables y meterlas aqui
            this.numHoras += lista[i].numHoras;
        }   
    }
    
    public void empezarClase(){
        if (!this.clase) {
            this.clase = true;
            int asignAle = (int)(Math.random()*(this.asigInpartidas-1) + 1);//Se pone -1 porque si el arrays es de 5 en vd es de 4 por eso aqui se pone uno menos
            System.out.println(this.nombre + " esta dando clase de " + lista[asignAle].codAsignatura); 
        }
    }
    
    public void parar(){
        if (this.clase) {
            this.clase = false;
            System.out.println(this.nombre + "Ha finalizado de dar clase");
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "El nombre del profesor es: " + this.nombre + "\n";
        for (int i = 0; i < this.asigInpartidas; i++) {
            res += "Imparto la asignatura: " + lista[i].codAsignatura +  " de " +lista[i].numHoras + " horas." + "\n";
        }
        res += "El numero de horas que tengo son: " + this.numHoras + "\n";
        if (clase) {
            res += "Estoy dando clase.\n";
        }
        else{
            res += "No estoy dando clase.\n";
        }
        return res;
    }
    
}
