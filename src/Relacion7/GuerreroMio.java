
package Relacion7;

public class GuerreroMio {
    private String nombre;
    private int salud;
    private int ataque;
    private int escudo;
    private int saludActual;
    private boolean muerto;//false es que esta vivo
    private armaMio miArma;
    
    private int nivel = 1;
    private int experienciaActual = 0;
    private int siguienteNivel = (int) Math.ceil(nivel*10+nivel*1.5);
    
    public GuerreroMio(String nombre, int salud, int ataque, int escudo, armaMio africa){
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.escudo = escudo;
        this.saludActual = this.salud;
        this.muerto = false;
        this.miArma = africa;
    }
    
    public int atacar(GuerreroMio defensor){
        this.comprobarMuerte();
        int ataquetotal = this.ataque + this.miArma.getPoder();
        int dañoTotal;
        if (!muerto) {
            if (this.comprobarArma()) {
                dañoTotal = defensor.salud - ataquetotal + defensor.escudo;
                defensor.salud -= dañoTotal;
                this.comprobarMuerte();
                this.miArma.restarResistencia();
                this.ataque();
            }
            else{
                dañoTotal = defensor.salud - this.ataque + defensor.escudo;
                defensor.salud -= dañoTotal;
                this.comprobarMuerte();
                this.miArma.restarResistencia();
                this.ataque();
            }
        } 
        else {
            System.out.println("Estas muerto");
        }
        return 0;
    }
    
    private void comprobarMuerte(){
        if (this.saludActual <= 0) {
            this.muerto = true;
            System.out.println("Estoy muerto");
        } 
        else{
            this.muerto = false;
            System.out.println("Estoy vivo");
        }
    }
    
    private boolean comprobarArma(){
        boolean arma = true;//true es que le queda resistencia y no se ha roto
        if (this.miArma.getResistencia() <= 0) {
            arma = false;
            
            System.out.println("Tu arma esta rota");
        }
        return arma;
    }
    
    public void mejorarArma(String nombre){
        if (nombre.equals(this.miArma.getArma())) {
            this.miArma.subirNivel();
        }
    }
    
    public boolean subir(){
        boolean puedeSubir = false;
        if (this.experienciaActual == this.siguienteNivel) {
            puedeSubir = true;
        }
        return puedeSubir;
    }
    
    public void subidaNivel(){
        this.nivel += 1;
        this.experienciaActual = 0;
        int nextLevel = this.siguienteNivel;
        this.ataque ++;
        this.escudo ++;
        this.salud += 10;
    }
    
    private void ataque(){
        if (this.miArma!=null && this.miArma.getResistencia() > 0) {
            this.experienciaActual += 3;
        }
        else{
            this.experienciaActual += 5;
        }
        if (this.subir()) {
            this.subidaNivel();
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        
        return res;
    }
}
