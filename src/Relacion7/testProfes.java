
package Relacion7;

public class testProfes {

    public static void main(String[] args) {
        Asignatura a1 = new Asignatura("LLMM",128);
        Asignatura a2 = new Asignatura("Entornos",63);
        
        Profesor p1 = new Profesor("Vicente", true);
        Profesor p2 = new Profesor("Vicente", true, a1);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
