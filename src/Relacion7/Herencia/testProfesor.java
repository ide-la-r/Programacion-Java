
package Relacion7.Herencia;

public class testProfesor {

    public static void main(String[] args) {
        Profesor manuva = new Profesor("manuva", 5);
        profesorUniversidad afri = new profesorUniversidad("Afri", 6, 10, 15);
        
        manuva.parar();
        System.out.println(manuva);
        afri.empezarClase();
        System.out.println(afri);
        
    }
    
}
