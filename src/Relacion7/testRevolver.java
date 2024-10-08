
package Relacion7;

public class testRevolver {

    public static void main(String[] args) {
        Revolver revolver = new Revolver("Winchester", "1883", 6);
        
        System.out.println(revolver);
        
        for (int i = 0; i < 25; i++) {
            System.out.println(revolver.disparar());
        }
        
        System.out.println(revolver);
    }
    
}
