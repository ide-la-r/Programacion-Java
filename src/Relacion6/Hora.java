
package Relacion6;

public class Hora {
    int horas;
    int minutos;
    int segundos;
    
    public Hora(int horas, int minutos, int segundos){
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
    }
    
    public Hora(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }
    
    public Hora(int horas){
        this.horas = horas;
    }
    
    public void cambiodeHora(int horas, int minutos, int segundos){
        if ((horas <= 24 && horas >= 0) && (minutos <= 60 && minutos >= 0) && (segundos <= 60 && segundos >= 0)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
        else {
            System.out.println("Los valores que has introducido no son correctos");
        }
    }
    
    public void mostrarHora(){
        System.out.println("La hora es:\n" + this.horas + ":" + this.minutos + ":" + this.segundos);
    }
    
}
