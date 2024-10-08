
package Relacion7.Herencia;

public class ocultacionTest {

    public static void main(String[] args) {
        Persona xavi = new Persona("Ex-entrenador", 38, 75);
        Empleado jaime = new Empleado("viejo", 89, 75, 1200);
        xavi.mostrarInfoPantalla();
        System.out.println("===========================================0");
        jaime.mostrarInfoPantalla();//sale null porque estamos cogiendo el constructor con los parametros y ahi no esta declarado el DNI.
    }
    
}
