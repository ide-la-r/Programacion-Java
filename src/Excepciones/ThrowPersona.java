
package Excepciones;

public class ThrowPersona {
    String nombre;
    int edad;
    
    public ThrowPersona(String nombre, int edad){
        this.nombre = nombre;
        if (edad < 0) {
            throw new NullPointerException("No puedo crear edades negativas");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "TrowPersona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
