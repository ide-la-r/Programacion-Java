
package Relacion7.Herencia;

public class Pelicula extends Multimedia{
    private String actor;
    private String actriz;
    
    public Pelicula(String titulo, String formato, double duracion, String actor, String actriz){
        super(titulo, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    public String getActor(){
        return actor;
    }

    public String getActriz(){
        return actriz;
    }
    
    public boolean equals(Pelicula igual){
        super.equals(igual);
        if (super.equals(igual)&&(this.actor.equals(igual.actor))&&(this.actor.equals(igual.actriz))) {
            return true;//True es que son iguales, y false que no
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        res += super.toString();
        res += ", su actor es " + this.actor + " y su actriz " + this.actriz;
        return res;
    }
    
}