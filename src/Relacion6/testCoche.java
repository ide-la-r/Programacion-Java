/*
Se desea implementar en JAVA la clase Coche. Cada coche debe tener un color,
una anchura, una altura, un numero de puertas y un numero de ruedas.
a) Programa la clase coche usando un constructor con parámetros. Ten en cuenta
que todo coche tiene 4 ruedas siempre.
b) Implementa el método arrancar() para arrancar el coche. Un coche sólo puede
arrancarse si está parado/apagado. El método mostrará por pantalla si consigue
arrancar el coche o no.
c) Implementa el método parar() para parar/apagar el coche. Un coche sólo puede
pararse si está arrancado. El método mostrará por pantalla si consigue parar el
coche o no.
d) Implementa el método desplazarse() para hacer que el coche se mueva. Un
coche sólo puede moverse si está arrancado. El método mostrará por pantalla si
consigue desplazarse con el coche o no.
 */
package Relacion6;


public class testCoche {

    public static void main(String[] args) {
        
        Coche Azul = new Coche("Azul", 3.4, 2.4, 4);
        Coche Rojo = new Coche("Rojo", 5.6, 6.7, 3);
        Coche r25 = new Coche(3);
        
        System.out.println("El color del primer coche es: " + Azul.color);
        System.out.println("La altura de el primer coche es: " + Azul.altura);
        System.out.println("La anchura del primer coche es: " + Azul.anchura);
        System.out.println("El numero de puertas que tiene el primer coche son: " + Azul.nºpuertas + "\n");
        
        System.out.println("El color del segundo coche es: " + Rojo.color);
        System.out.println("La altura de el segundo coche es: " + Rojo.altura);
        System.out.println("La anchura del segundo coche es: " + Rojo.anchura);
        System.out.println("El numero de puertas que tiene el segundo coche son: " + Rojo.nºpuertas);
        
        Azul.parar();
        Azul.parar();
        Azul.arrancar();
        Azul.desplazarse();
        Azul.arrancar();
        Azul.parar();
        Azul.desplazarse();
    }
    
}
