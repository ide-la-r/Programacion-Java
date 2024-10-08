
package Relacion7.Herencia;

public class testMamifero {

    public static void main(String[] args) {
        Perro fufi = new Perro(4, 30, "pitbull", "fufi");
        Gato misifu = new Gato(5, 60, "siames", "misifu");
        
        System.out.println(fufi);
        System.out.println(fufi.comunicarse());
        fufi.setMezcla(false);
        fufi.jugar();
        System.out.println(fufi);
        System.out.println("==================================================");
        System.out.println(misifu);
        misifu.cazar();
        misifu.setPelaje("Largo");
        System.out.println(misifu);
        System.out.println(misifu.comunicarse());
    }
    
}
