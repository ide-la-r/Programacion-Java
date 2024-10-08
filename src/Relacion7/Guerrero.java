//Agregacion, este codigo esta guarreado se puede minimizar con metodos, el de comprobar muerte seria uno, el de bajar la defensa de la arma tambien.
package Relacion7;

public class Guerrero {
    private String nombre;
    private double saludMAX, ataque, escudo;
    private double saludACT;
    private arma miArma;
    private boolean muerto;
    
    private int nivel;
    private int experienciaActual, siguienteNivel;
    
    public Guerrero(String nombre, double saludMAX, double ataque, double escudo, arma amparo){
        this.nombre = nombre;
        this.saludMAX = saludMAX;
        this.ataque = ataque;
        this.escudo = escudo;
        this.miArma = amparo;
        
        this.saludACT = this.saludMAX;
        this.muerto = false;
        
        this.nivel = 1;
        this.experienciaActual = 0;
        this.siguienteNivel = (int)Math.ceil(this.nivel * 10 + this.nivel * 1.5);
    }
    //cada if y else se refiere a guarreado a que en vez de eso seria metodos
    public void atacar(Guerrero defensor){//esto ha dicho jaime que en casa no lo haamos que ha cambiado el devolver por un soup.
        if (!this.muerto) {
            double ataqueTotal;
            if (miArma.getResistencia() > 0) {
                ataqueTotal = this.miArma.getPoder();//si quitamos el get me da un error, no lo dice el enunciado pero habria que hacer un get para mostrar elthis.miarma asique por eso se hace el get si no no se puede mostrar
                this.experienciaActual += 3;
            }
            else{
                ataqueTotal = this.ataque;
                this.experienciaActual += 5;
            }
            
            double danio = ataqueTotal - defensor.escudo;
            if (danio < 0) {
                danio = 1;//Como enfe da pena, vamos a quitar 1 como minimo.
            }
            defensor.saludACT -= danio;
            double resOld = this.miArma.getResistencia();
            this.miArma.setResistencia(resOld - 1);
            
            if (defensor.saludACT <= 0) {
                defensor.muerto = true;
            }
        }
        else{
            System.out.println("Maricarmen esta muerta");
        }
    }
    
    public void mejorarArma(String nombre){
        if (nombre.equalsIgnoreCase(this.miArma.getNombre())) {
            this.miArma.subirNivel();
        }
    }
    //lo pongo private aunque no lo dice.
    private boolean subir(){
        return this.experienciaActual == this.siguienteNivel;
    }
    
    public void subirNivel(){
        this.nivel += 1;
        this.experienciaActual = 0;
        this.siguienteNivel = (int)Math.ceil(this.nivel * 10 + this.nivel * 1.5);
        this.ataque += 1;
        this.escudo += 1;
        this.saludMAX += 10;
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", saludMAX=" + saludMAX + ", ataque=" + ataque + ", escudo=" + escudo + ", saludACT=" + saludACT + '}';
    }
    
    
}
