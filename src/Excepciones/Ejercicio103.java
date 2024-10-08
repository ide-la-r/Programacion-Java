package Excepciones;

public class Ejercicio103 {

    public static void main(String[] args) {
        System.out.println("Programa automatico");
        
        try {
            throw new RuntimeException("Soy una RuntimeException");
        } catch (RuntimeException e) {
            System.out.println("Se ha detectado la excepcion: " + e.getMessage());
        }
        finally{
            System.out.println("Programa terminado");
        }
    }
    
}
