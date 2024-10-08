
package Cadenas;

public class Ejercicio6 {

    public static void main(String[] args) {
        String cad = "Volando, volando... siempre arriba";
        System.out.println("La posicion de la primera 'd' en los 7 primeros caracteres es la posicion: " + cad.substring(0,7).indexOf('d'));
        System.out.println("La posicion de la primera 'd' en los 7 ultimos caracteres es la posicion: " + cad.substring(cad.length()-7).indexOf('d'));
    }
    
}
