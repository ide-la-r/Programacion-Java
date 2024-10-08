
package Relacion7.Herencia;

public class testHerencia1 {

    public static void main(String[] args) {
        Persona luser = new Persona();
        luser.mostrarInfoPantalla();
        System.out.println("============================");
        //Empleado jaime = new Empleado();//Si yo tengo un constructor creado en el empleado que es el que hereda de persona ya no podria heredar el constructor vacio de persona
        Empleado jaime = new Empleado("Ismael", 18, 95, 2000);
        jaime.mostrarInfoPantalla();
        System.out.println("============================");
        System.out.println(jaime);
    }
    
}
