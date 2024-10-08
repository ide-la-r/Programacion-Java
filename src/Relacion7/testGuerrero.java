
package Relacion7;

public class testGuerrero {

    public static void main(String[] args) {
        
        arma daguita = new arma("Chiquito kenny", 5, 5);
        arma arrancapulmones = new arma("Malboro", 3, 15);

        Guerrero enfe = new Guerrero("Santiago", 100, 10, 60, arrancapulmones);
        Guerrero jose = new Guerrero("Don jose", 60, 50, 30, daguita);
        
            }
    
}
