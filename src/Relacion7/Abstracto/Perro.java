

package Relacion7.Abstracto;

public class Perro extends Mamifero {
    String raza;
    String nombre;
    
    public Perro(String raza, String nombre, int numpatas, double peso, int vidamedia) {
        super(numpatas, peso, vidamedia);
        this.raza = raza;
        this.nombre = nombre;
    }
    
    @Override
    public void comunicarse(){
        System.out.println("GUAU GUAU");
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nombre=" + nombre + '}';
    }
    
}
