/*
Queremos implementar una clase para controlar los relojes digitales de 24 horas.
De un reloj es necesario saber las horas, los minutos, y los segundos que marcan.
Tambien debemos controlar si el reloj esta encendido o no.

El reloj puede:
- encenderse(): el reloj pasa a estado encendido.
- apagarse(): el reloj pasa a estado apagado.

- adelantarHora(): suma una hora CORRECTA a la hora actual.
- adelantarMinutos(): igual para los minutos.
- adelantarSegundos(int cantidad): añade "cantidad" a los segundos actuales.

Un reloj puede "hacer cosas" si y solo si esta encendido
a) Crea un constructor al que se le pasara como parametros las horas,
minutos y segundos. Si alguno de esos valores no es correcto, se lepondra 00
Un reloj siepre empieza APAGADO.
b) Implementa los metodos indicados mas arriba
c) Implementa el metodo adecuado para representar los objetos de la clase con la siguiente plantilla:
El reloj esta apagado.
o
El reloj esta encendido y son las HH:MM:SS (siendo H las horas actuales,
M, los minutos actuales y S, los segundos actuales)

 */
package Relacion6;

public class Reloj {
    int horas;
    int minutos;
    int segundos;
    boolean encendido = false;//true si esta encendido.
    boolean apagarse = false;//true es que esta apagado.
    
    public Reloj(int horas, int minutos, int segundos){
        this.horas = horas;
        if ((this.horas < 0 || this.horas > 24)) {
            this.horas = 00;
        }
        this.minutos = minutos;
        if ((this.horas < 0 || this.horas > 59)) {
            this.minutos = 00;
        }
        this.segundos = segundos;
        if ((this.horas < 0 || this.horas > 59)) {
            this.segundos = 00;
        }
    }
    
    public void encenderse(){
        if (this.encendido == false && this.apagarse == false) {
            System.out.println("El reloj se esta encendiendo");
            this.encendido = true;
        }
        else{
            System.out.println("El reloj ya esta encendido");
        }
    }
    
    public void apagarse(){
        if (this.encendido == true && this.apagarse == false) {
            System.out.println("El reloj se esta apagando.");
            this.encendido = false;
        }
        else{
            System.out.println("El reloj ya esta apagado.");
        }
    }
    
    public void adelantarHora(){
        this.horas ++;
        if (this.horas == 24) {
            this.horas = 00;
        }
        System.out.println("La hora ahora es: "+ this.horas);
    }
    
    public void adelantarMinutos(){
        this.minutos ++;
        if (this.minutos == 60) {
            this.minutos = 00;
            this.adelantarHora();
        }
        System.out.println("La hora ahora es: " + this.minutos);
    }
    
    public void adelantarSegundos(int cantidad){
        if (this.encendido == true) {
            this.segundos += cantidad;
            if (this.segundos >= 60) {
                int sobraMin = this.segundos / 60;
                this.segundos = this.segundos % 60;
                for (int i = 0; i < sobraMin; i++) {
                    this.adelantarMinutos();
                }
        }
        }
        else {
            System.out.println("Esta apagado no te puedo dar los segundos.");
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        if (this.encendido == false) {
            res = "El reloj esta apagado";
        }
        else{
            res = "Estado del reloj: \n";
            res += this.horas + ":" + this.minutos + ":" + this.segundos;
        }
        return res;
    }
}
