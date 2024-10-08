
package Relacion6;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private double calificaciones[];
                                             //El temaño no hace falta ponerlo fuera o eso dice en el video
    public Estudiante(String nombre, String apellidos, int tamaño){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = new double[tamaño];
        //Aqui lo que hacemos es iniciar todos los huecos al valor -1 como si este fuera que este vacio.
        for (int i = 0; i < this.calificaciones.length; i++) {
            this.calificaciones[i] = - 1;
        }
    }
    
    public boolean insertarNota(double nota){
        //Busco el primer valor -1 en el array, si lo encuentro hay un hueco y puedo meter la nueva nota si no no se puede.
        int i = 0;
        boolean encontrado = false;//esta variable me indica si he encontrado hueco o no.
        while (i < this.calificaciones.length && !encontrado) {
            if (this.calificaciones[i] == -1) {
                this.calificaciones[i] = nota;
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    
    //Aqui devolvemos una cadena bien hecha con sus comas y sin que en la ultima saquen comas.
    public String mostrarNotas (){
        String res = "";
        for (int i = 0; i < this.calificaciones.length; i++) {
            res += this.calificaciones[i];
            if (i < this.calificaciones.length -1) {
                System.out.println(",");
            }
        }
        return res;
    }
    //Aqui lo que hacemos es mediante un bucle sumar todas las cantidades que estan rellenas porque no tiene un -1, luego hacemos el contador
    //para que cuente el numero de huecos que hay rellenos sin el -1, y despues haces la media de la suma con el numero de huecos.
    public double calcularMedia(){
        int suma = 0;
        int contador = 0;
        int media;
        for (int i = 0; i < this.calificaciones.length; i++) {
            if (this.calificaciones[i] > -1) {
                suma += i;
                contador++;
            }
        }
        media = suma/contador;
        return media;
    }
    
    public int indicarRangos(){
        int insuficiente = 0;
        int suficiente = 0;
        int notable = 0;
        int sobresaliente = 0;
        
        for (int i = 0; i < this.calificaciones.length; i++) {
            if (this.calificaciones[i] >= 0 && this.calificaciones[i] <= 4) {
                insuficiente++;
            }
            else if (this.calificaciones[i] >= 5 && this.calificaciones[i] <=6) {
                suficiente++;
            }
            else if (this.calificaciones[i] >= 7 && this.calificaciones[i] <=8) {
                notable++;
            }
            else if (this.calificaciones[i] >= 9 && this.calificaciones[i] <=10) {
                sobresaliente++;
            }
        }
        return insuficiente;//...esto esta mal se haria mejor con un array.
    }
    
    public String toString(){
        String res = "";
        res += "Estudiante: " + this.nombre + " " + this.apellidos + "\n";
        res += "Notas: " + this.mostrarNotas() + "\n";
        res += "Rangos: " + this.indicarRangos() + "\n";
        res += "Media: " + this.calcularMedia();
        return res;
    }
    
}
