
package Relacion7.Herencia;

public class Gato extends Mamifero{
    String raza;
    String nombre;
    String pelaje;
    
    public Gato(int numpatas, int mediavida, String raza, String nombre){
        super(numpatas, mediavida);
        this.raza = raza;
        this.nombre = nombre;
        this.pelaje = "Corto";
    }

    public String getPelaje(){
        return pelaje;
    }

    public void setPelaje(String pelaje){
        this.pelaje = pelaje;
    }
    
    @Override
    public String comunicarse(){
        return "MIAU! MIAU!";
    }
    
    @Override
    public void dormir(){
        System.out.println("Duermo 15 horas");
    }
    
    public void cazar(){
        System.out.println("Mi gato de " + super.getNumpatas() + " esta cazando");
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "tengo " + super.getNumpatas() + " patas, mi media de vida es: " + super.getMediavida();
        res += " mi raza es: " + this.raza + " mi nombre es " + this.nombre + " y mi pelaje es " + this.pelaje;
        return res;
    }
    
}
