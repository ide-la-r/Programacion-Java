package Excepciones;

public class testPiscina {
    
    public static void main(String[] args) {
        
        Piscina pisci = new Piscina((int)(Math.random()*(100-1+1)+1));
        
        for (int i = 0; i < 4; i++) {
            try{
                pisci.ponerAgua((int)(Math.random()*(25-1+1)+1));
                System.out.println("El nivel es: " + pisci.getNivel());
            }
            catch(PiscinaException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("------------------------Vaciando");
        for (int i = 0; i < 4; i++) {
            try{ 
                pisci.quitarAgua((int)(Math.random()*(25-1+1)+1));
                System.out.println("El nivel es: " + pisci.getNivel());
            }
            catch(PiscinaException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
