
package Relacion7.Abstracto;

public class TestMamifero {

    public static void main(String[] args) {
        //Mamifero capibara = new Mamifero(4, 40, 10); Da error en capibara porque no puedes hacer un objeto de una clase abstracta
        
        Perro yira = new Perro("yira", "bull terrier", 4, 30, 14);
        Gato ifrit = new Gato("Anaranjado", 4, 4, 15);
    }
    
}
