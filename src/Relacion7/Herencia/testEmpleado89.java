
package Relacion7.Herencia;

public class testEmpleado89 {

    public static void main(String[] args) {
        Empleado89 E1 = new Empleado89("Jaime");
        Directivo D1 = new Directivo("Carmelo");
        Operario OP1 = new Operario("Jose",34);
        Oficial OF1 = new Oficial("David",123);
        Tecnico T1 = new Tecnico("Rafa",986);
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }
    
}
