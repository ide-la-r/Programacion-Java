
package Excepciones;

public class TestImpar {

    public static void main(String[] args) {
        try {
            System.out.println(new Impar(24));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
