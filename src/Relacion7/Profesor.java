//Agregacion
package Relacion7;

public class Profesor {
    private String nombre;
    private boolean sexo;
    //1. Tengo una (o varias) propiedades de la clase a usar
    private Asignatura materia;
    
    public Profesor(String nombre, boolean sexo){
        this.nombre = nombre;
        this.sexo = sexo;
        this.materia = null;
    }
    //2. Pueden pasarme UN OBJETO YA CREADO por los parametros del constructor...
    public Profesor(String nombre, boolean sexo, Asignatura primera){
        this.nombre = nombre;
        this.sexo = sexo;
        this.materia = primera;
    }
    //3. Utilizo la propiedad Asignatura(que tiene un objeto) como una propiedad mas en mi codigo.
    //4. Asegurate que cuando voy a trabajar con el objeto, este exista
    public String infoAsignatura(){
        String res = "La asignatura de este profe es: ";
        if (this.materia != null) {
            res += this.materia.getNombre();
            res += "<>" + this.materia.getNhoras();
        }
        else{
            res += "Este profesor no tiene asignatura";
        }
        return res;
    }
    //2. ... O cualquier otro metodo
    public void setAsignatura(Asignatura otra){
        this.materia = otra;
    }
    
    public Asignatura getMateria(){
        return this.materia;
    }
    
    @Override
    public String toString(){
        return this.nombre + ": " + this.infoAsignatura();
    }
}
