
package Relacion7.Herencia;

public class testMultimedia {

    public static void main(String[] args) {
        Pelicula titanic = new Pelicula("Titanic", "mp5", 2.30, "Juan", "maribel");
        Pelicula copiatitanic = new Pelicula("Titanic", "mp3", 2.30, "Juan", "maribel");
        Cancion eladio = new Cancion("Mala mia", "mp4", 0.03, "eladio", "rimas", "reggaeton");
        
        System.out.println(titanic.equals(copiatitanic));
        System.out.println("==========================================");
        System.out.println(titanic);
        System.out.println("==========================================");
        System.out.println(eladio);
    }
    
}
